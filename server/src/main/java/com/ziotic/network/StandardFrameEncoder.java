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

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

/**
 * @author Lazaro
 */
public class StandardFrameEncoder implements ProtocolEncoder {
    public static final StandardFrameEncoder INSTANCE = new StandardFrameEncoder();

    @Override
    public void encode(IoSession session, Object message, ProtocolEncoderOutput output) throws Exception {
        if(message instanceof Frame) {
            Frame frame = (Frame) message;

            byte[] buffer = frame.getBuffer();
            if (frame.getLength() < buffer.length) {
                byte[] newBuffer = new byte[frame.getLength()];
                System.arraycopy(buffer, 0, newBuffer, 0, frame.getLength());
                buffer = newBuffer;
            }

            output.write(IoBuffer.wrap(buffer));
        }
    }

    @Override
    public void dispose(IoSession session) throws Exception {
    }
}
