package com.akshay.microdemodeptservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akshay.microdemodeptservice.entity.Department;
import com.akshay.microdemodeptservice.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentRepo repo;
	
	public Department saveDepartment(Department department) {
		LOGGER.info("Inside DepartmentService saveDepartment...");
		return repo.save(department);
	}
	
	public Department getDepartmentById(Long departmentId) {
		LOGGER.info("Inside DepartmentService getDepartmentById...");
		return repo.findById(departmentId).get();
	}
	
}
