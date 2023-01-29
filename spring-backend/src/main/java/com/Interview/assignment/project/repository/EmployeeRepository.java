package com.Interview.assignment.project.repository;

import com.Interview.assignment.project.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    public Employee findByName(String f_name);

}
