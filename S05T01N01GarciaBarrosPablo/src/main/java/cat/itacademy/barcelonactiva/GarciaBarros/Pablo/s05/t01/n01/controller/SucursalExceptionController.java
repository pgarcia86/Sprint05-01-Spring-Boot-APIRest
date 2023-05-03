package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.ErrorMessage;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.NotFoundIdException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.NotValidIdException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n01.controller.exceptions.NotValidURIException;

@RestControllerAdvice
public class SucursalExceptionController extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleException(NotFoundIdException e){
		
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		return buildResponseEntity(httpStatus, e);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleException(NotValidIdException e){
		
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		return buildResponseEntity(httpStatus, e);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleException(NotValidURIException e){
		
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		return buildResponseEntity(httpStatus, e);
	}
	
	
	
	public ResponseEntity<ErrorMessage> buildResponseEntity(HttpStatus httpStatus, Exception e) {
		
		ErrorMessage error = new ErrorMessage(e);
		return new ResponseEntity<>(error, httpStatus);
	}
}
