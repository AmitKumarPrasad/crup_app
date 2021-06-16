package com.amit.dev.crud_app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.amit.dev.crud_app.service.StudentService;

@Controller
public class WebStudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("students", service.getAll());
		return "index";
	}

}
