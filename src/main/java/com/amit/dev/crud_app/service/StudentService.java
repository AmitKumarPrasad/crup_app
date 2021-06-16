package com.amit.dev.crud_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.dev.crud_app.dao.StudentRepo;
import com.amit.dev.crud_app.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	public List<Student> getAll() {
		return repo.findAll();
	}
	
	

}
