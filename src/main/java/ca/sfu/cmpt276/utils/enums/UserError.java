package ca.sfu.cmpt276.utils.enums;

public enum UserError {
    USER_NOT_FOUND("Invalid username or password.", 401),
    SESSION_EXPIRED("Session expired. Please login again.", 401);

    private final String message;
    private final int statusCode;

    UserError(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }
}