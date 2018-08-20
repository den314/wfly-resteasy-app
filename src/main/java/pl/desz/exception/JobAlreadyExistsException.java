package pl.desz.exception;

public class JobAlreadyExistsException extends RuntimeException {

    public JobAlreadyExistsException(String message) {
        super(message);
    }
}
