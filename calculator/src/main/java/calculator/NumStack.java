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
    // TODO Auto-generated method stub
    return stack.isEmpty();
    
  }

  public float pop() throws EmptyStackException{
    // TODO Auto-generated method stub
    
    Entry floatval = stack.pop();
    return floatval.getFloat();
  }

}
