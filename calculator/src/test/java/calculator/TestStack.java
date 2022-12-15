package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * TDD for TestStack.java
 * 
 * @author zkac118
 *
 */
public class TestStack {

  /**
   * Checks the constructor and checks if setSize() method returns correct value.
   */
  @Test
  public void sizeTest() { // TEST 1 - Stack constructor, setSize(), getSize().
    Stack test = new Stack();
    test.setSize(2);
    assertEquals("setSize() method was not able to set the value of size to 2", 2, test.getSize());
  }

  /**
   * Creates a Stack object and checks if is empty using isEmpty() method. The test allows for the
   * creation of a isEmpty method() for empty stack testing.
   */
  @Test
  public void emptyTest() { // TEST 2 - Empty stack check.
    Stack test = new Stack();
    assertTrue("isEmpty() method did not return true for an empty stack", test.isEmpty());
  }

  /**
   * Creates a Stack object and checks if after pushing an entry the stack contains and item. The
   * test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void pushTest() { // TEST 3 - Pushing a value test.
    Stack test = new Stack();
    test.push(new Entry(56.25f));
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /**
   * Creates a Stack object and checks if the Stack items can be removed after being pushed. The
   * test uses isEmpty to check whether pushing then popping leaves the stack empty.
   * 
   * Checks
   */
  @Test
  public void popTest() { // TEST 4 - Removing a value test.
    Stack test = new Stack();
    test.push(new Entry(42.74f));
    test.pop();
    assertTrue("pop() method did not remove entry from stack", test.isEmpty());
  }

  /**
   * Creates a Stack object and checks if the correct Float value is being contained. The test
   * pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void floatPopTest() { // TEST 5 - Popping a Float test.
    Stack test = new Stack();
    test.push(new Entry(56.25f));
    test.push(new Entry(42.43f));
    Entry floatPop = test.pop();
    assertEquals("Value popped does not equal 42.43", 42.43f, floatPop.getFloat(), 0.0f);
  }

  /**
   * Creates a Stack object and checks if the correct Symbol value is being contained. The test
   * pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void symbolPopTest() { // TEST 6 - Popping a Symbol test.
    Stack test = new Stack();
    test.push(new Entry(Symbol.TIMES));
    Entry symbolPop = test.pop();
    assertEquals("Value popped is not *", "*", String.valueOf(symbolPop.getSymbol()));
  }

  /**
   * Creates a Stack object and checks if the correct String value is being contained. The test
   * pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void stringPopTest() { // TEST 7 - Popping a String test.
    Stack test = new Stack();
    test.push(new Entry("string"));
    Entry stringPop = test.pop();
    assertEquals("Value popped does not equal string", "string", stringPop.getString());
  }

  /**
   * Creates a Stack object and checks if the correct Type value is being contained. The test pushes
   * a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void typePopTest() { // TEST 8 - Popping Type test.
    Stack test = new Stack();
    test.push(new Entry(Type.INVALID));
    Entry typePop = test.pop();
    assertEquals("Value popped does not equal INVALID", "INVALID", typePop.toString());
  }

  /**
   * Creates a stack object and checks if the values are being stored in correct order. The test
   * allows the creation of top() which compares the top value to the last value entry.
   */
  @Test
  public void topTest() { // TEST 9 - top() test with float value.
    Stack test = new Stack();
    test.push(new Entry(32.54f));
    Entry topVal = test.top();
    assertEquals("top() method does not return correct value of 32.54", 32.54f, topVal.getFloat(),
        0.0f);
  }

}
