package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions;

public class CannotDeleteException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DESCRIPTION = "NO SE PUDO ELIMINAR LA SUCURSAL";

	public CannotDeleteException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
