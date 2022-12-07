package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  private OpStack test;

  /**
   * A OpStack object is created to use for tests.
   */
  @BeforeEach
  private void setup() {
    test = new OpStack();
  }
  @Test
  void PushTest() {// TEST 1 - Pushing a symbol.
    test.push(Symbol.PLUS);
    assertEquals(test.isEmpty(),false,"IsEmpty() returned false when stack should not be empty");
  }
}
