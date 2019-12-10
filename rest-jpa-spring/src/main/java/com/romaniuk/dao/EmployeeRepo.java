package com.romaniuk.dao;

import com.romaniuk.entity.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();
}
