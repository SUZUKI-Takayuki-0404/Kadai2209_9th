package exercise9th.mybatisdemo.exceptionhandlers;

public class NameNotFoundException extends RuntimeException {

    public NameNotFoundException() {
        super();
    }

    public NameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameNotFoundException(String message) {
        super(message);
    }

    public NameNotFoundException(Throwable cause) {
        super(cause);
    }

}
