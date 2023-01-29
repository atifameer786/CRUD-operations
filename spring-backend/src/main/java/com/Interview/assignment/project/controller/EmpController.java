package com.Interview.assignment.project.controller;

import com.Interview.assignment.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/show")
    public String show() {
        return "hello";
    }

    @PostMapping("/createuser")
    public String createEmp(@RequestParam("f_name") String f_name,
                            @RequestParam("l_name") String l_name,
                            @RequestParam("mob_num") String mob_num,
                            @RequestParam("email_id") String email_id,
                            @RequestParam("job_pos") String job_pos) {
        return employeeService.createEmployee(f_name, l_name, mob_num, email_id, job_pos);

    }

    @PostMapping("/updateemp")
    public String updateEmp(@RequestParam("emp_id") Long emp_id,
                            @RequestParam("f_name") String f_name,
                            @RequestParam("l_name") String l_name,
                            @RequestParam("mob_num") String mob_num,
                            @RequestParam("email_id") String email_id,
                            @RequestParam("job_pos") String job_pos) {
        return employeeService.updateEmployee(emp_id, f_name, l_name, mob_num, email_id, job_pos);


    }

    @GetMapping("/deleteemp/{id}")
    public String deleteEmployee(@PathVariable("id") long emp_id) {
        employeeService.deleteEmployee(emp_id);
        return "Employee Deleted";
    }

    @GetMapping("/findall")
    public String findall(@RequestParam("f_name") String f_name) {
        return employeeService.findEmployee(f_name);

    }
}