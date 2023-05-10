package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions;

@SuppressWarnings("serial")
public class CannotDeleteException extends RuntimeException{
	
	private static final String DESCRIPTION = "NO SE PUEDE ELIMINAR LA FLOR";
	
	public CannotDeleteException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
