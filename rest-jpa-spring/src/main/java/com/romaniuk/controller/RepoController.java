package com.romaniuk.controller;

import com.romaniuk.dao.EmployeeRepo;
import com.romaniuk.dao.ProjectRepo;
import com.romaniuk.entity.Employee;
import com.romaniuk.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class RepoController {

    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String displayHome(Model model) {
        List<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        List<Employee> employeeList = employeeRepo.findAll();
        model.addAttribute("employees", employeeList);
        return "current-projects";
    }



}
