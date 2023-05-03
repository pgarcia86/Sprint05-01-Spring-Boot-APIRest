package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions;

public class NotFoundIdException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6515327062299980688L;
	private static final String DESCRIPTION = "NO SE ENCONTRO EL ID BUSCADO";
	
	public NotFoundIdException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
