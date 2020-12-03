package gaba.REST.json;

public class personNotFoundException extends RuntimeException {

	public personNotFoundException() {
	
	}

	public personNotFoundException(String message) {
		super(message);
	
	}

	public personNotFoundException(Throwable cause) {
		super(cause);
		
	}

	public personNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public personNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
