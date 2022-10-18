package com.se.execptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.se.Errors.PlayerErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
//	@ExceptionHandler
//	ResponseEntity<PlayerErrorResponse> playerNotFoundExceptionhandler(PlayerNotFoundException exception)
//	 {
//		System.out.println("exception method called");
//		 PlayerErrorResponse playerErrorResponse = new PlayerErrorResponse();
//		 playerErrorResponse.setMessage(exception.getMessage());
//		 playerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//
//		return new ResponseEntity<PlayerErrorResponse>(playerErrorResponse,HttpStatus.BAD_REQUEST);
//	 }
	
	@ExceptionHandler
	String playerNotFoundExceptionhandler(PlayerNotFoundException exception)
	 {
		System.out.println("exception method called");
		 PlayerErrorResponse playerErrorResponse = new PlayerErrorResponse();
		 playerErrorResponse.setMessage(exception.getMessage());
		 playerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());

		return  "exceptionpage";
	 }

}
