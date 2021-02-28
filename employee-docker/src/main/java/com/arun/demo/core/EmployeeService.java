package com.arun.demo.core;

import com.arun.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by GBS03785 on 2/27/2021.
 */
@Service
public class EmployeeService {

    private static List<Employee> EMPLOYEES = Arrays.asList(
      new Employee(1L, "Arun", "IT"),
      new Employee(2L, "Anbu", "IT"),
      new Employee(3L, "Muthu", "IT")

    );

    public List<Employee> getAll() {
        return EMPLOYEES;
    }

}
