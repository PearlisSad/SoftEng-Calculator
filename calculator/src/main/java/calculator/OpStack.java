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
   * 
   * @param plus
   */
  public void push(Symbol plus) {
    Entry ent = new Entry(plus);
    stack.push(ent);
  }

  /**
   * Uses the isEmpty() method from the Stack class to check if the stack is empty
   * 
   * @return boolean true if the stack is empty, if not then it will return false
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public Symbol pop(){
    Entry ent = stack.pop();
    return ent.getSymbol();
    
  }
}
