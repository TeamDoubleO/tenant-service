package com.doubleo.tenantservice.domain.employee.repository;

import com.doubleo.tenantservice.domain.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
