package CatchExceptions;

public class AgeLessThanZeroException extends IllegalArgumentException {
    // inherits exception base class

    // No args constructor
    public AgeLessThanZeroException(){}
    // custom message args constructor
    public AgeLessThanZeroException(String message){
        super(message);
    }
    // constructor used if the exception is caused to other exception
    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }
    // Throwable and custom message
    public AgeLessThanZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
