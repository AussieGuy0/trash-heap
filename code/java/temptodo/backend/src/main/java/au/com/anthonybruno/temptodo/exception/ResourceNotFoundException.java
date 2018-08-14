package au.com.anthonybruno.temptodo.exception;

public class ResourceNotFoundException extends HttpException {

    public ResourceNotFoundException(String message) {
        super(message, 404);
    }
}
