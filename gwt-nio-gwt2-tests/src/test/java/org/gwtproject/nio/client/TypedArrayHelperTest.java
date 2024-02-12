package org.gwtproject.nio.client;

import com.google.gwt.junit.client.GWTTestCase;
import elemental2.core.ArrayBuffer;
import java.nio.ByteBuffer;
import org.gwtproject.nio.TypedArrayHelper;
import org.junit.Test;

public class TypedArrayHelperTest extends GWTTestCase {

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

  @Override
  public String getModuleName() {
    return "org.gwtproject.nio.NIOTest";
  }
}
