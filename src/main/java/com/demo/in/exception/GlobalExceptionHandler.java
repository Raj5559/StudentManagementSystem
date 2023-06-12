package com.demo.in.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ModelAndView handleStudentNotFoundException(StudentNotFoundException snfe) {
		
		ModelAndView mav=new ModelAndView("student");
		mav.addObject("error", snfe.getMessage());
		return mav;
		
	}

}
