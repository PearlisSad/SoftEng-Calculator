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
  void PopTest() {
    test.push("Testing 123");
    assertEquals(test.isEmpty(), false, "isEmpty() returns true when stack is not empty");
  }

}
