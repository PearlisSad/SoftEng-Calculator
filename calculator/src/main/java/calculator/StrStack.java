package calculator;

import java.util.EmptyStackException;

/**
 * A stack that will contain String values
 * 
 * @author zkac118
 */
public class StrStack {
  Stack stack;

  /**
   * Constructor for the StrStack class
   */
  public StrStack() {
    this.stack = new Stack();
  }

  /**
   * Uses push() method from Stack class to push a String object to the stack.
   * @param string pushes a String value into the stack as an Entry object.
   */
  public void push(String string) {
    Entry ent = new Entry(string);
    stack.push(ent);
  }

  /**
   * Checks if there are any values in the stack using the isEmpty() method from the Stack class.
   * @return boolean true if there are no values in the stack and false if otherwise.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  
  /**
   * The last value on the stack is removed and is returned using the getString() method from the Entry class.
   * @return The Entry object at the last place in the stack.
   * @throws EmptyStackException if the size of the stack is empty then the pop() method cannot be used.
   */
  public String pop() throws EmptyStackException{    
    Entry stringval = stack.pop();
    return stringval.getString();
  }

}
