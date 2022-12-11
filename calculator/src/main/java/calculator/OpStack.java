package calculator;

/**
 * A stack of symbol values.
 * 
 * @author zkac118
 *
 */
public class OpStack {
  private Stack stack;

  /**
   * Constructor to create a OpStack object.
   */
  public OpStack() {
    this.stack = new Stack();
  }

  /**
   * Uses push() method from Stack class to push a Symbol object to the stack.
   * @param plus pushes a Symbol value into the stack as an Entry object.
   */
  public void push(Symbol plus) {
    Entry ent = new Entry(plus);
    stack.push(ent);
  }

  /**
   * Uses the isEmpty() method from the Stack class to check if the stack is empty
   * @return boolean true if the stack is empty, if not then it will return false
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  /**
   * The last value on the stack is removed and is returned using the getSymbol() method from the Entry class.
   * @return The Entry object at the last place in the stack.
   * @throws EmptyStackException if the size of the stack is empty then the pop() method cannot be used.
   */
  public Symbol pop() throws EmptyStackException{
    Entry opval = stack.pop();
    return opval.getSymbol();
    
  }
}
