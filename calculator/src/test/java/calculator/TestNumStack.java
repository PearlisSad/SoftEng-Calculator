package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TDD forTestNumStack.java
 * 
 * @author zkac118
 *
 */
class TestNumStack {
  private NumStack test;

  /**
   * A NumStack object is created to use for tests.
   */
  @BeforeEach
  private void setup() {
    test = new NumStack();
  }

  /**
   * A float value is pushed to the stack and the stack will be checked if the value has been added.
   * 
   */
  @Test
  void PushTest() {// TEST 1 - Pushing a float value.
    test.push(56.25f);
    assertEquals(test.isEmpty(), false,
        "Testing that isEmpty(0 method returns correct booelan val");
  }

  /**
   * A float value is pushed to the stack then it will be popped to check if the value is removed.
   * 
   */
  @Test
  void PopTest() {// TEST 2 - Popping a value from NumStack.
    test.push(56.25f);
    test.pop();
    assertEquals(test.isEmpty(), true, "Testing that pop() method removes last entry in stack");
  }

  /**
   * Two float values are pushed and a value will be popped to check if the correct value will be popped.
   * 
   */
  @Test
  void testEmptyStackException() {// TEST 3 - Popping an empty stack.
    test.push(5.0f);
    test.push(6.0f);
    assertEquals(test.pop(), 6.0f, "Testing if pop() methods returns the last entry in stack ");

  }

}
