package calculator;

import java.util.EmptyStackException;

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
  
  public String pop() throws EmptyStackException{    
    Entry stringval = stack.pop();
    return stringval.getString();
  }

}
