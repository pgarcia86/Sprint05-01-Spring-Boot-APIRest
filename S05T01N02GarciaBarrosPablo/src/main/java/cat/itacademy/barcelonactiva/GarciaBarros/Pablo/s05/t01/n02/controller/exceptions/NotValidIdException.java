package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions;

@SuppressWarnings("serial")
public class NotValidIdException extends RuntimeException{
	
	private static final String DESCRIPTION = "EL ID INGRESADO NO ES VALIDO";
	
	public NotValidIdException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
