package org.gwtproject.nio.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.j2cl.junit.apt.J2clTestInput;
import elemental2.core.ArrayBuffer;
import java.nio.ByteBuffer;
import org.gwtproject.nio.TypedArrayHelper;
import org.junit.Test;

@J2clTestInput(TypedArrayHelperTest.class)
public class TypedArrayHelperTest {

  @Test
  public void wrap() {
    ArrayBuffer ab = new ArrayBuffer(10);
    ByteBuffer tested = TypedArrayHelper.wrap(ab);
    assertTrue(tested.capacity() == 10);
    assertEquals(0, tested.position());
  }

  @Test
  public void unwrap() {
    ArrayBuffer ab = new ArrayBuffer(10);
    ByteBuffer tested = TypedArrayHelper.wrap(ab);
    assertEquals(ab, TypedArrayHelper.unwrap(tested).buffer);
  }

  @Test
  public void stringToByteBuffer() {
    ByteBuffer tested = TypedArrayHelper.stringToByteBuffer("test");
    assertEquals(4, tested.capacity());
    assertEquals(0, tested.position());
  }
}
