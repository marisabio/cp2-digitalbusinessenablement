package com.fiap.digitalenablement.cp2.repository;

import com.fiap.digitalenablement.cp2.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}