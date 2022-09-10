package com.akshay.microdemodeptservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akshay.microdemodeptservice.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
