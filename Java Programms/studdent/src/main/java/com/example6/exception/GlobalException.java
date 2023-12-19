package com.example6.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example6.exception.ErrorDetails;
import com.example6.exception.ResourceNotFoundException;

public class GlobalException 
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundExHandling(ResourceNotFoundException exception,
			WebRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), 
				exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
}
