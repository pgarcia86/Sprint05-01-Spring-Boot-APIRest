package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions;

public class NotValidIdException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1310986338508737654L;
	private static final String DESCRIPTION = "EL ID INGRESADO NO ES VALIDO";
	
	public NotValidIdException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
