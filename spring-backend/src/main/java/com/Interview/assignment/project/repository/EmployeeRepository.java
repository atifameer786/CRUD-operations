package com.Interview.assignment.project.repository;

import com.Interview.assignment.project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

//    @Query(value = "select * from employee " ,nativeQuery = true)
    public Employee findByName(String f_name);
//    public Boolean findByEmpId(Long emp_id);




}
