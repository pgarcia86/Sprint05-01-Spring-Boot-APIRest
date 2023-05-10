package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions;

@SuppressWarnings("serial")
public class NotValidURIException extends RuntimeException{

	private static final String DESCRIPTION = "LA PAGINA NO SE HA ENCONTRADO";
	
	public NotValidURIException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

}
