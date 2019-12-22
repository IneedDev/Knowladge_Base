package com.romaniuk.api.controllers;

import com.romaniuk.dao.EmployeeRepo;
import com.romaniuk.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app-api/employees")
public class EmployeeApiController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        //findById return Optional which need to be handled
        return employeeRepo.findById(id).get();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
}
