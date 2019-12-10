package com.romaniuk.controller;

import com.romaniuk.dao.ProjectRepo;
import com.romaniuk.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/projects")
@Component
public class ProjectController {


    @Autowired
    ProjectRepo projectRepo;

    @RequestMapping("/new")
    public String displayProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "new-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Project project, Model model, RedirectAttributes redirectAttributes) {

        projectRepo.save(project);
        //redirect against duplicate submissions
        return "redirect:/projects/new";
    }
}
