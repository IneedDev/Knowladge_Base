package com.romaniuk.controller;

import com.romaniuk.dao.EmployeeRepo;
import com.romaniuk.dao.ProjectRepo;
import com.romaniuk.entity.Employee;
import com.romaniuk.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/projects")
@Component
public class ProjectController {


    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String displayProjectForm(Model model) {
        List<Employee> employeeList = employeeRepo.findAll();
        model.addAttribute("project", new Project());
        model.addAttribute("allEmployees", employeeList);
        return "new-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Project project, Model model, RedirectAttributes redirectAttributes) {

        projectRepo.save(project);
        //redirect against duplicate submissions
        return "redirect:/projects/new";
    }
}
