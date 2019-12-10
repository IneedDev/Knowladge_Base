package com.romaniuk.controller;

import com.romaniuk.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("formData", new User());

        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String processFormData(User user, RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute(user);
        return "redirect:/display";
    }

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String processFormDataRedirect(User user){

        return "result";
    }
}
