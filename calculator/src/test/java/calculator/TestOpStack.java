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

  /**
   * A Symbol object is pushed into the stack, checks if the stack is empty after pushing a symbol.
   */
  @Test
  void PushTest() {// TEST 1 - Pushing a symbol.
    test.push(Symbol.PLUS);
    assertEquals(test.isEmpty(), false, "isEmpty() returned true when stack should not be empty");
  }
  
  @Test
  void PopTest() {//TEST 2 - Popping a value
    test.push(Symbol.PLUS);
    test.pop();
    assertEquals(test.isEmpty(),true, "isEmpty() returned false when stack should be empty");
  }
}

  
