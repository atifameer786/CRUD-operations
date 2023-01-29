package com.Interview.assignment.project.service;


import com.Interview.assignment.project.entity.Employee;
import com.Interview.assignment.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
//    create
    @Autowired
    EmployeeRepository employeeRepository;
    public String createEmployee(String f_name,
                                 String l_name,
                                 String mob_num,
                                 String email_id,
                                 String job_pos){
        Employee emp = new Employee();
          emp.setName(f_name);
          emp.setL_name(l_name);
          emp.setMob_num(mob_num);
          emp.setEmail_id(email_id);
          emp.setJob_pos(job_pos);
          employeeRepository.save(emp);
         return "employee created";
    }



//    update

    public String updateEmployee(long emp_id,
                                 String f_name,
                                 String l_name,
                                 String mob_num,
                                 String email_id,
                                 String job_pos){
        Optional<Employee> emp =  employeeRepository.findById(emp_id);
        if(f_name != " ")
            emp.get().setName(f_name);
        if(l_name != " ")
            emp.get().setL_name(l_name);
        if(mob_num != " ")
            emp.get().setMob_num(mob_num);
        if(job_pos != " ")
            emp.get().setJob_pos(job_pos);
        employeeRepository.save(emp.get());
        return "employee Updated";


    }





//    delete
public String deleteEmployee(long emp_id){
        employeeRepository.deleteById(emp_id);


    return  "Employee Deleted";


}


//    read

    public String findEmployee(String f_name){


    return employeeRepository.findByName(f_name).toString();

    }



}
