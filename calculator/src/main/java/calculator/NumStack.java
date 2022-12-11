package calculator;

import java.util.EmptyStackException;

/**
 * Stack that will contain float values.
 * 
 * @author zkac118
 *
 */
public class NumStack {
  Stack stack;
  
  /**
   * Constructor to create a NumStack object.
   */
  public NumStack() {
    this.stack = new Stack();
  }
  
  /**
   * Uses the push() method from Stack class to add a float value to the stack.
   * 
   * @param f 
   */
  public void push(float f) {
    Entry ent = new Entry(f);
    stack.push(ent);
  }

  /**
   * Uses the isEmpty() method from the Stack class to check if the stack is empty
   * 
   * @return boolean true if the stack is empty, if not then it will return false
   */
  public Boolean isEmpty() {
    return stack.isEmpty(); 
  }

  /**
   * The last value on the stack is removed and is returned using the getFloat() method from the Entry class.
   * 
   * @return The Entry object at the last place in the stack.
   * 
   * @throws EmptyStackException if the size of the stack is empty then the pop() method cannot be used.
   */
  public float pop() throws EmptyStackException {
    Entry floatval = stack.pop();
    return floatval.getFloat();
  }

}
