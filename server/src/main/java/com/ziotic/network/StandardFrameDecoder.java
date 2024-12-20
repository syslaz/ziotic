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
package com.ziotic.network;

import com.ziotic.Static;
import com.ziotic.utility.Logging;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class StandardFrameDecoder extends CumulativeProtocolDecoder {
    private static final Logger logger = Logging.log();

    public static final StandardFrameDecoder INSTANCE = new StandardFrameDecoder();

    @Override
    protected boolean doDecode(IoSession session, IoBuffer buffer, ProtocolDecoderOutput output) throws Exception {
        if (buffer.hasRemaining()) {
            int opcode = buffer.get() & 0xff;
            int length = Static.clientConf.getFrameLengths()[opcode];
            switch (length) {
                case -1:
                    if (buffer.hasRemaining()) {
                        length = buffer.get() & 0xff;
                    } else {
                        buffer.rewind();
                        return false;
                    }
                    break;
                case -2:
                    if (buffer.remaining() >= 2) {
                        length = buffer.getShort() & 0xffff;
                    } else {
                        buffer.rewind();
                        return false;
                    }
                    break;
                case -3:
                    logger.warn("Size not set for frame opcode: " + opcode);
                    length = buffer.remaining();
                    break;
            }
            if (buffer.remaining() >= length) {
                byte[] frameBuffer = new byte[length];
                buffer.get(frameBuffer);

                output.write(new Frame(opcode, Frame.FrameType.RECIEVED, frameBuffer, length));
                return true;
            } else {
                buffer.rewind();
                return false;
            }
        } else {
            return false;
        }
    }
}
