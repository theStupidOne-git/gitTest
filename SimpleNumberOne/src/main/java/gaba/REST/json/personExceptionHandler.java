package gaba.REST.json;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class personExceptionHandler {

	
//Exception for personNotFoundException
@ExceptionHandler
public ResponseEntity<personExceptionResponse> handleException(personNotFoundException exc){
personExceptionResponse error = new personExceptionResponse(
		                            HttpStatus.NOT_FOUND.value(),exc.getMessage(),System.currentTimeMillis());	
return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);	
}


//Dalsi vyjimky

@ExceptionHandler
public ResponseEntity<personExceptionResponse> catchAll(Exception exc){
personExceptionResponse error = new personExceptionResponse(
		                            HttpStatus.BAD_REQUEST.value(),exc.getMessage(),System.currentTimeMillis());	
return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);	
}

}
