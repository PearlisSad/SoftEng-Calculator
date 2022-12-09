package calculator;

public class StrStack {
  Stack stack;

  public StrStack() {
    this.stack = new Stack();
  }

  public void push(String string) {
    Entry ent = new Entry(string);
    stack.push(ent);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

}
