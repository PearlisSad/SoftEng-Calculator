package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumStack {
  private NumStack ns;

  @BeforeEach
  private void setup() {
    ns = new NumStack();
    
  }
  @Test
  void test() {
    ns.push(56.25f);
    assertEquals(ns.isEmpty(), false, "Testing that isEmpty(0 method returns correct booelan val");
    
    
  }

}
