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

import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import java.nio.ByteBuffer;
import java.nio.DirectReadWriteByteBuffer;
import jsinterop.annotations.JsMethod;

/** Allows us to wrap an existing typed array buffer in a ByteBuffer. */
public class TypedArrayHelper {

  public static ByteBuffer wrap(ArrayBuffer ab) {
    return new DirectReadWriteByteBuffer(ab);
  }

  @JsMethod
  public static native ArrayBufferView unwrap(ByteBuffer bb) /*-{
        var casted = @elemental2.core.Js::uncheckedCast(Ljava/lang/Object;)(bb);
        return casted.getTypedArray();
    }-*/;

  private static ByteBuffer buffer = ByteBuffer.allocate(1);

  @JsMethod
  public static native ByteBuffer stringToByteBuffer(String s) /*-{
        var buffer = @org.gwtproject.nio.TypedArrayHelper::buffer;
        return buffer.stringToByteBuffer(s);
    }-*/;
}
