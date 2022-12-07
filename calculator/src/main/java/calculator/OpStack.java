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

  public void push(Symbol plus) {
    Entry ent=new Entry(plus);
    stack.push(ent);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
