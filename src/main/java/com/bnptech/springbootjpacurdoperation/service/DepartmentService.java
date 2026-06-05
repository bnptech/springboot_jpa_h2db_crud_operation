package com.bnptech.springbootjpacurdoperation.service;

import com.bnptech.springbootjpacurdoperation.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department, Long departmentid);

    void deleteDepartmentById(Long departmentid);
}
