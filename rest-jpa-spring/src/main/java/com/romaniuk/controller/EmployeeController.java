package com.romaniuk.controller;

import com.romaniuk.dao.*;
import com.romaniuk.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    ProjectRepo projectRepo;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String displayEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new-employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Employee employee, Model model) {

        employeeRepo.save(employee);
        //redirect against duplicate submissions
        return "redirect:/employees/new";
    }
}
