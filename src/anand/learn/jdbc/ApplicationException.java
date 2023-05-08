package anand.learn.jdbc;

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;

	public ApplicationException() {
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}
}
