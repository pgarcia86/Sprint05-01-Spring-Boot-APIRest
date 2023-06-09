package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions.CannotDeleteException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions.ErrorMessage;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions.NotFoundIdException;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s05.t01.n02.controller.exceptions.NotValidIdException;

@RestControllerAdvice
public class FlorExceptionController extends ResponseEntityExceptionHandler{
	
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
	public ResponseEntity<ErrorMessage> handleException(CannotDeleteException e){
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		return buildResponseEntity(httpStatus, e);
	}
	
	private ResponseEntity<ErrorMessage> buildResponseEntity(HttpStatus httpStatus, Exception e){
		
		ErrorMessage error = new ErrorMessage(e);
		return new ResponseEntity<>(error, httpStatus);
	}

}
