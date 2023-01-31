package com.Interview.assignment.project.repository;

import com.Interview.assignment.project.entity.Employee;
import com.Interview.assignment.project.service.EmployeeService;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class EmployeeRepositoryTest {

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findByName() {
        Employee emp = new Employee(25l,"piya","khan","7836921030","ziya123@gmail.com","BA");
        employeeRepository.save(emp);
        Optional<Employee> actualResult = Optional.ofNullable(employeeRepository.findByName("piya"));


    }
    @Test
    void findByEmpId() {

        Employee emp = new Employee(25l, "ziya", "khan", "7836921030", "ziya123@gmail.com", "BA");
        employeeRepository.save(emp);

        Optional<Employee> actualResult = employeeRepository.findById(25l);
        assertThat(actualResult).toString();
    }
    }
//}