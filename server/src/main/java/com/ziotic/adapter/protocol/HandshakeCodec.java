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
import com.ziotic.network.FrameBuilder;
import com.ziotic.network.StandardFrameEncoder;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.*;

/**
 * @author Lazaro
 */
public class HandshakeCodec extends CumulativeProtocolDecoder implements ProtocolCodecFactory {
    private static Logger logger = Logging.log();

    public static final ProtocolCodecFilter FILTER = new ProtocolCodecFilter(new HandshakeCodec());

    @Override
    protected boolean doDecode(IoSession session, IoBuffer buffer, ProtocolDecoderOutput output) throws Exception {
        if (buffer.hasRemaining()) {
            int opcode = buffer.get() & 0xff;
            switch (opcode) {
                case 14:
                    session.write(new FrameBuilder(1).writeByte(0).toFrame());
                    session.getFilterChain().replace("codec", LoginCodec.FILTER);
                    return false;
                case 15: // JS5
                    if (buffer.remaining() >= 4) {
                        int clientVersion = buffer.getInt();
                        if (clientVersion != Static.clientConf.getClientVersion()) {
                            logger.error("Invalid client version from <" + session.toString() + "> : " + clientVersion);
                            session.write(new FrameBuilder(1).writeByte(6).toFrame()).addListener(IoFutureListener.CLOSE);
                            return false;
                        }

                        FrameBuilder fb = new FrameBuilder(1 + DATA.length).writeByte(0);
                        for (int i : DATA) {
                            fb.writeInt(i);
                        }
                        session.write(fb.toFrame());
                        session.getFilterChain().replace("codec", JS5Codec.FILTER);
                        return false;
                    } else {
                        buffer.rewind();
                        return false;
                    }
                default:
                    logger.debug("Unhandled protocol opcode: " + opcode);
                    return false;
            }
        }
        return false;
    }

    private static int[] DATA = {
        56,79325,55568,46770,24563,299978,44375,0,4176,3589,109125,604031,176138,292288,
        350498,686783,18008,20836,16339,1244,8142,743,119,699632,932831,3931,2974,
    };

    @Override
    public ProtocolEncoder getEncoder(IoSession session) throws Exception {
        return StandardFrameEncoder.INSTANCE;
    }

    @Override
    public ProtocolDecoder getDecoder(IoSession session) throws Exception {
        return this;
    }
}
