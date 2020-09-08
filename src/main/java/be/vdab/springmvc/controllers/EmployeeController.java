package be.vdab.springmvc.controllers;

import be.vdab.springmvc.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public ModelAndView getAllEmployees(ModelMap model) {
        model.addAttribute("employees", manager.getAllEmployees());
        return new ModelAndView("employeeListDisplay", model);
    }
}


