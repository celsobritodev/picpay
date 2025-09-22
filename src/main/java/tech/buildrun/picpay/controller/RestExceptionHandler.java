package tech.buildrun.picpay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tech.buildrun.picpay.exception.PicPayException;

@RestControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(PicPayException.class)
	public ProblemDetail handlePicpayException(PicPayException ex) {
		return ex.toProblemDetail();
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ProblemDetail handleValidationException(MethodArgumentNotValidException ex) {
		
		var fieldErros = ex.getFieldErrors()
				.stream()
				.map(f -> new InvalidParam(f.getField() , f.getDefaultMessage()))
				.toList();
		
		var problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
		
		problemDetail.setTitle("Your request parameters didn't validate.");
		problemDetail.setProperty("invalid-params", fieldErros);
		
		return problemDetail;
		
	}
	
	
	private record InvalidParam(String name, String reason) { }

}
