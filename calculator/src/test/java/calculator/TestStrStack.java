package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
  private StrStack test;

  /**
   * A NumStack object is created to use for tests.
   */
  @BeforeEach
  private void setup() {
    test = new StrStack();
  }
  @Test
  void PushTest() {// TEST 1 - Pushing a string object
    test.push("Testing 123");
    assertEquals(test.isEmpty(), false, "isEmpty() returns true when stack is not empty");
  }
  
  @Test
  void PopTest() {// TEST 2 - Popping a string object
    test.push("Testing 456");
    test.push("Testing 789");
    assertEquals(test.pop(),"Testing 789","pop() method does not return correct value");
  }
}
