/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.gwtproject.nio;

import java.nio.ByteBuffer;
import java.nio.DirectByteBuffer;
import java.nio.DirectReadWriteByteBuffer;

import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import jsinterop.base.Js;

/**
 * Allows us to wrap an existing typed array buffer in a ByteBuffer.
 */
public class TypedArrayHelper {

    public static ByteBuffer wrap(ArrayBuffer ab) {
        return new DirectReadWriteByteBuffer(ab);
    }

    public static ArrayBufferView unwrap(ByteBuffer bb) {
        return Js.<DirectByteBuffer>uncheckedCast(bb).getTypedArray();
    }

    private static ByteBuffer buffer = ByteBuffer.allocate(1);

    public static ByteBuffer stringToByteBuffer(String s) {
        return buffer.stringToByteBuffer(s);
    }

}
