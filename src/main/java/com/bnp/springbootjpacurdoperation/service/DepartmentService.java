package com.bnp.springbootjpacurdoperation.service;

import com.bnp.springbootjpacurdoperation.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department, Long departmentid);

    void deleteDepartmentById(Long departmentid);
}
