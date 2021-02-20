package com.MicroservicesExample.department.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MicroservicesExample.department.Entity.Department;
import com.MicroservicesExample.department.Repository.DepartmentRepository;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside SaveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		log.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findDepartmentById(id);
	}


}
 