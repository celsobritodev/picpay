package tech.buildrun.picpay.controller;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tech.buildrun.picpay.exception.PicPayException;

@RestControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(PicPayException.class)
	public ProblemDetail handlePicpayException(PicPayException ex) {
		return ex.toProblemDetail();
	}

}
