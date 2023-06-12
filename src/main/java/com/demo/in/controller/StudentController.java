package com.demo.in.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.in.entity.Student;
import com.demo.in.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@ModelAttribute
	public void getCities(Model model) {
		List<String> cities = new ArrayList();
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Vijayawada");
		model.addAttribute("cities", cities);
	}

	@GetMapping(value = "/register")
	public ModelAndView getRegistrationPage() {
		ModelAndView mav = new ModelAndView("registration");
		Student student = new Student();
		mav.addObject("student", student);
		return mav;
	}

	@PostMapping(value = "/register")
	public ModelAndView postRegistrationPage(@Valid @ModelAttribute Student student, BindingResult result) {
		ModelAndView mav = new ModelAndView("registration");

		if (result.hasErrors()) {
			return mav;
		} else {
			Student savedStdent = studentService.saveStudent(student);

			mav.addObject("savedStudent", savedStdent);
			return mav;
		}

	}
	
	@GetMapping(value = "/getStudent")
	public ModelAndView getStudentPage() {
		ModelAndView mav= new ModelAndView("student");
		
		return mav;
	}
	
	@PostMapping(value = "/getStudent")
	public ModelAndView postStudentPage(@RequestParam Integer sid) {
		ModelAndView mav= new ModelAndView("student");
		if(sid==0) {
				mav.addObject("msg", "Student Id is required");
		}
		else {
			Student savedStudent=studentService.getSingleStudent(sid);
			mav.addObject("savedStudent", savedStudent);
		}
		
		return mav;
		
		
	}
	

}
