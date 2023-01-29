package com.Interview.assignment.project.controller;

import com.Interview.assignment.project.entity.Employee;
import com.Interview.assignment.project.repository.EmployeeRepository;
import com.Interview.assignment.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    // @GetMapping("/show")
    // public String show() {
    // return "hello";
    // }

    @PostMapping("/createuser")
    public String createEmpp(@RequestBody(required = false) Employee e) {
        return employeeService.createEmployee(e.getName(), e.getL_name(), e.getMob_num(), e.getEmail_id(),
                e.getJob_pos());

    }

    @PostMapping("/updateemp")
    public String updateEmp(@RequestParam(value = "emp_id", required = true) Long emp_id,
            @RequestParam(value = "f_name", required = false) String f_name,
            @RequestParam(value = "l_name", required = false) String l_name,
            @RequestParam(value = "mob_num", required = false) String mob_num,
            @RequestParam(value = "email_id", required = false) String email_id,
            @RequestParam(value = "job_pos", required = false) String job_pos) {
        return employeeService.updateEmployee(emp_id, f_name, l_name, mob_num, email_id, job_pos);

    }

    @GetMapping("/deleteemp/{id}")
    public String deleteEmployee(@PathVariable("id") long emp_id) {
        employeeService.deleteEmployee(emp_id);
        return "Employee Deleted";
    }

    @GetMapping("/findbyid/{id}")
    public Optional<Employee> findall(@PathVariable Long id) {
        return employeeService.findEmployee(id);

    }

    @GetMapping("/findalldata")
    public Iterable<Employee> find() {
        return employeeRepository.findAll();
    }
}