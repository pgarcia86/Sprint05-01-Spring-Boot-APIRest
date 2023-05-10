package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions;

@SuppressWarnings("serial")
public class NotFoundIdException extends RuntimeException{
	
	private static final String DESCRIPTION = "NO SE ENCONTRO EL ID BUSCADO";
	
	
	public NotFoundIdException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}


}
