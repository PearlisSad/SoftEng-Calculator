package calculator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * TDD for Symbol.java
 * 
 * @author zkac118
 *
 */
public class TestSymbol {

  /**
   * The test checks for the creation of the Symbol objects  +,-,N,/,*,(,).
   */
  @Test
  public void test() { // TEST 1 - Constructor
    assertNotNull("PLUS could not be created", Symbol.PLUS);
    assertNotNull("MINUS could not be created", Symbol.MINUS);
    assertNotNull("INVALID could not be created", Symbol.INVALID);
    assertNotNull("DIVIDE could not be created", Symbol.DIVIDE);
    assertNotNull("TIMES could not be created", Symbol.TIMES);
    assertNotNull("LEFT_BRACKET could not be created", Symbol.LEFT_BRACKET);
    assertNotNull("RIGHT_BRACKET could not be created", Symbol.RIGHT_BRACKET);
    assertNotNull("INVALID could not be created", Symbol.INVALID);
  }

  /**
   * The test checks the creation of a getter and a working toString() method.
   */
  @Test
  public void testValues() { // TEST 2 - toString() and getSymbol()
    assertEquals("The string value '*' is not returned by toString", "*", Symbol.TIMES.toString());
    assertEquals("The string value '/' is not returned by toString", "/", Symbol.DIVIDE.toString());
    assertEquals("The string value '+' is not returned by toString", "+", Symbol.PLUS.toString());
    assertEquals("The string value '-' is not returned by toString", "-", Symbol.MINUS.toString());
    assertEquals("The string value 'N' is not returned by toString", "N",
        Symbol.INVALID.toString());
    assertEquals("String value '(' not returned by toString", "(", Symbol.LEFT_BRACKET.toString());
    assertEquals("String value ')' not returned by toString", ")", Symbol.RIGHT_BRACKET.toString());

  }

}
