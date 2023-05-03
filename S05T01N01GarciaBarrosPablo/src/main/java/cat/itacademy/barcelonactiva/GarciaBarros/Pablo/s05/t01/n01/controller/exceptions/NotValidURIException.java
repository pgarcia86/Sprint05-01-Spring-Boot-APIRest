package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions;

public class NotValidURIException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4243945932555667340L;
	private static final String DESCRIPTION = "LA PAGINA NO SE HA ENCONTRADO";
	
	public NotValidURIException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
