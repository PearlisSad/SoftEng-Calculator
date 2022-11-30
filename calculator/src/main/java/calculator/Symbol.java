package calculator;

/**
 * A list of symbols to be used in a mathematical expression.
 * 
 * @author zkac118
 *
 */
public enum Symbol {
    TIMES('*'), DIVIDE('/'), PLUS('+'), MINUS('-'), INVALID('N'), LEFT_BRACKET('('), RIGHT_BRACKET(
            ')');

    char symbol;

    /**
     * The constructor for creating Symbol objects with a character value.
     * 
     * @param symbol this uses the character value for enumerators.
     */
    Symbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * toString to create a string that identifies a specific symbol.
     * 
     * @return String to return the Symbol object.
     */
    public String toString() {
        return String.valueOf(this.symbol);
    }

    /**
     * Get method to return the symbol object.
     * 
     * @return Character for object symbol.
     */
    public char getSymbol() {
        return this.symbol;
    }

}
