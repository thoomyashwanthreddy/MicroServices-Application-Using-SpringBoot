package com.MicroservicesExample.department.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroservicesExample.department.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findDepartmentById(Long id);


}
