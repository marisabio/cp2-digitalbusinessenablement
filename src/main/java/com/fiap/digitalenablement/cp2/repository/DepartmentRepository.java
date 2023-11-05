package com.fiap.digitalenablement.cp2.repository;

import com.fiap.digitalenablement.cp2.domain.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}