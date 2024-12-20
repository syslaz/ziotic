/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ziotic.adapter.protocol;

import com.ziotic.Static;
import com.ziotic.engine.login.LoginRequest;
import com.ziotic.engine.login.LoginResponse;
import com.ziotic.network.StandardCodec;
import com.ziotic.network.StandardFrameEncoder;
import com.ziotic.network.handler.GameFrameDispatcher;
import com.ziotic.utility.Logging;
import com.ziotic.utility.Streams;
import com.ziotic.utility.Text;
import com.ziotic.utility.crypt.XTEA;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.*;

/**
 * @author Lazaro
 */
public class LoginCodec extends CumulativeProtocolDecoder implements ProtocolCodecFactory {
    private static final Logger logger = Logging.log();

    public static final ProtocolCodecFilter FILTER = new ProtocolCodecFilter(new LoginCodec());

    @Override
    protected boolean doDecode(IoSession session, IoBuffer buffer, ProtocolDecoderOutput output) throws Exception {
        if (buffer.remaining() >= 3) {
            int opcode = buffer.get() & 0xff;
            int size = buffer.getShort() & 0xffff;
            LoginResponse resp = LoginResponse.LOGIN;
            LoginRequest req = new LoginRequest();
            req.session = session;
            req.opcode = opcode;
            login:
            do {
                if (buffer.remaining() >= size) {
                    int clientRevision = buffer.getInt();
                    if (clientRevision != Static.clientConf.getClientVersion()) {
                        resp = LoginResponse.CLIENT_UPDATED;
                        break login;
                    }

                    int loaderVersion = buffer.getShort() & 0xffff;
                    int clientVersion = buffer.getShort() & 0xffff;
                    if (loaderVersion != 9870) {
                        if (loaderVersion != Static.conf.getInt("loader_version")) {
                            resp = LoginResponse.CLIENT_UPDATED;
                            break login;
                        }
                        if (clientVersion != Static.conf.getInt("client_version")) {
                            resp = LoginResponse.CLIENT_UPDATED;
                            break login;
                        }
                    }

                    int rsaBlockSize, rsaHeaderKey;
                    String name, password;
                    int[] xteaKey;
                    byte[] xteaBlock;
                    XTEA xtea;
                    IoBuffer buffer2;
                    switch (opcode) {
                        case 16: // Normal login
                        case 18: // Reconnection login
                            if (Static.isGame()) {
                                rsaBlockSize = buffer.getShort(); // RSA block size
                                rsaHeaderKey = buffer.get(); // RSA header key
                                if (rsaHeaderKey != 10) {
                                    logger.warn("Incorrect RSA header key: " + rsaHeaderKey);
                                }
                                xteaKey = new int[4];
                                for (int i = 0; i < xteaKey.length; i++) {
                                    xteaKey[i] = buffer.getInt();
                                }
                                buffer.getLong(); // Hard-coded 0
                                password = Streams.readString(buffer);
                                buffer.getLong(); // ??
                                buffer.getLong(); // ??
                                xteaBlock = new byte[size - rsaBlockSize - 10]; // - 6
                                buffer.get(xteaBlock);
                                xtea = new XTEA(xteaKey);
                                xtea.decrypt(xteaBlock, 0, xteaBlock.length);
                                buffer2 = IoBuffer.wrap(xteaBlock);
                                name = Streams.readString(buffer2);
                                buffer2.get();
                                buffer2.get();
                                buffer2.getShort();
                                buffer2.getShort();
                                buffer2.get();
                                for (int i = 0; i < 24; i++) {
                                    buffer2.get();
                                }
                                Streams.readString(buffer2);
                                buffer2.getInt();
                                buffer2.skip(buffer2.get() & 0xff);
                                // TODO more data that i cbf to read
                                req.name = Text.formatNameForProtocol(name);
                                req.password = password;
                                req.time = System.currentTimeMillis();
                            } else {
                                resp = LoginResponse.ERROR;
                            }
                            break;
                        case 19: // Lobby login
                            if (Static.isLobby()) {
                                rsaBlockSize = buffer.getShort(); // RSA block size
                                rsaHeaderKey = buffer.get(); // RSA header key
                                if (rsaHeaderKey != 10) {
                                    logger.warn("Incorrect RSA header key: " + rsaHeaderKey);
                                }
                                xteaKey = new int[4];
                                for (int i = 0; i < xteaKey.length; i++) {
                                    xteaKey[i] = buffer.getInt();
                                }
                                buffer.getLong(); // Hard-coded 0
                                password = Streams.readString(buffer);
                                buffer.getLong(); // ??
                                buffer.getLong(); // ??
                                xteaBlock = new byte[size - rsaBlockSize - 10];  // - 6
                                buffer.get(xteaBlock);
                                xtea = new XTEA(xteaKey);
                                xtea.decrypt(xteaBlock, 0, xteaBlock.length);
                                buffer2 = IoBuffer.wrap(xteaBlock);
                                name = Streams.readString(buffer2);
                                buffer2.get();
                                buffer2.get();
                                for (int i = 0; i < 24; i++) {
                                    buffer2.get();
                                }
                                Streams.readString(buffer2);
                                buffer2.getInt();
                                for (int i = 0; i < 34; i++) {
                                    buffer2.getInt();
                                }
                                req.name = Text.formatNameForProtocol(name);
                                req.password = password;
                                req.time = System.currentTimeMillis();
                            } else {
                                resp = LoginResponse.ERROR;
                            }
                            break;
                    }
                } else {
                    buffer.rewind();
                    return false;
                }
            } while (false);
            if (resp == LoginResponse.LOGIN) {
                session.getFilterChain().replace("codec", StandardCodec.FILTER);
                session.getFilterChain().addLast("dispatcher", GameFrameDispatcher.INSTANCE);
                Static.engine.getLoginEngine().submit(req);
                logger.debug("Dispatched login request [name=" + req.name + ", pass=" + req.password.replaceAll(".", "\\*") + "]");
            } else {
                if (opcode == 16 || opcode == 18) {
                    Static.proto.sendLoginResponse(session, null, resp);
                } else if (opcode == 19) {
                    Static.proto.sendLobbyResponse(session, null, resp);
                }
                logger.debug("Refused login request [name=" + req.name + ", response=" + resp.toString() + "]");
            }
        }
        return false;
    }

    @Override
    public ProtocolEncoder getEncoder(IoSession session) throws Exception {
        return StandardFrameEncoder.INSTANCE;
    }

    @Override
    public ProtocolDecoder getDecoder(IoSession session) throws Exception {
        return this;
    }
}
