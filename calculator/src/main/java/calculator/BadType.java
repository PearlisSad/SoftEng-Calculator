package calculator;

/**
 * Exception for when the object Type is used with wrong getter  .
 * 
 * @author zkac118
 *
 */
@SuppressWarnings("serial")
public class BadType extends RuntimeException {
    /**
     * The exception message displayed.
     * 
     * @param msg the string message being displayed for the exception being dealt
     *            with.
     */
    public BadType(String msg) {
        super(msg);
    }
}
