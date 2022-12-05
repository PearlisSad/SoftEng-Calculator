package calculator;

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

}
