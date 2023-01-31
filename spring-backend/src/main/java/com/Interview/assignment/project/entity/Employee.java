package com.Interview.assignment.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String name;
    private String l_name;
    private String mob_num;
    private String email_id;
    private String job_pos;

}
