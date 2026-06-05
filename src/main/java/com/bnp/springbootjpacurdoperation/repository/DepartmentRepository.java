package com.bnp.springbootjpacurdoperation.repository;

import com.bnp.springbootjpacurdoperation.entity.Department;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
