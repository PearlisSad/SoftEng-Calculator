package calculator;

import java.util.EmptyStackException;

public class NumStack {
  Stack stack = new Stack();

  public void push(float f) {
    // TODO Auto-generated method stub
    Entry ent = new Entry(f);
    stack.push(ent);
    
    
    
  }

  public Boolean isEmpty() {
    return stack.isEmpty(); 
  }

  public float pop() throws EmptyStackException{    
    Entry floatval = stack.pop();
    return floatval.getFloat();
  }

}
