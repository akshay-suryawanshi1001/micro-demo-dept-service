package com.akshay.microdemodeptservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akshay.microdemodeptservice.entity.Department;
import com.akshay.microdemodeptservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		LOGGER.info("Inside DepartmentController saveDepartment...");
		return service.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside DepartmentController getDepartmentById...");
		return service.getDepartmentById(departmentId);
	}
}
