package calculator;

/**
 * Exception for when empty stack is popped or when top is checked.
 * 
 * @author zkac118
 *
 */
@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
    /**
     * The exception message displayed.
     * 
     * @param msg the string message being displayed for the exception being dealt
     *            with.
     */
    public EmptyStackException(String msg) {
        super(msg);
    }
}
