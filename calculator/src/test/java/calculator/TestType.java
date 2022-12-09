package calculator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * TDD for Type.java
 * 
 * @author zkac118
 *
 */
public class TestType {

  /**
   * Checks if the Type enumerator objects are being created.
   * 
   */
  @Test
  public void test() { // TEST 1 - Constructor
    assertNotNull("Type.SYMBOL could not be created", Type.SYMBOL);
    assertNotNull("Type.NUMBER could not be created", Type.NUMBER);
    assertNotNull("Type.INVALID could not be created", Type.INVALID);
    assertNotNull("Type.STRING could not be created", Type.STRING);
  }

  /**
   * Checks if the toString() method creates matching strings to the Type enumerator object.
   */
  @Test
  public void testString() { // TEST 2 - toString(), getType()
    assertEquals("String value 'SYMBOL' incorrect by toString", "SYMBOL", Type.SYMBOL.toString());
    assertEquals("String value 'NUMBER' incorrect by toString", "NUMBER", Type.NUMBER.toString());
    assertEquals("String value 'INVALID' incorrect by toString", "INVALID",
        Type.INVALID.toString());
    assertEquals("String value 'STRING' incorrect by toString", "STRING", Type.STRING.toString());
  }
}
