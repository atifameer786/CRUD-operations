package com.Interview.assignment.project;

import com.Interview.assignment.project.entity.Employee;
import com.Interview.assignment.project.repository.EmployeeRepository;
import com.Interview.assignment.project.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class CrudProjectApplicationTests {


	@Test
	void contextLoads() {
	}


}
