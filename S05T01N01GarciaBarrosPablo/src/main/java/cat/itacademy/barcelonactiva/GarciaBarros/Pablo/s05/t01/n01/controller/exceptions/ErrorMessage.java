package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions;

public class ErrorMessage {
	
	private String exception;
	private String message;
	
	public ErrorMessage(Exception exception) {
		this.exception = exception.getClass().getSimpleName();
		this.message = exception.getMessage();
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "ErrorMessage {exception=" + exception + "\\ message=" + message;
	}

}
