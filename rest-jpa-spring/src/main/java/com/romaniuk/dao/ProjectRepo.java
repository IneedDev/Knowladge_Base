package com.romaniuk.dao;

import com.romaniuk.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepo extends CrudRepository<Project, Long> {

    @Override
    public List<Project> findAll();
}
