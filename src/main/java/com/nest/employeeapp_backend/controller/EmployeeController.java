package com.nest.employeeapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to employee home page";
    }

    @GetMapping("/add")
    public String AddEmployee()
    {
        return "Add Employee Page";
    }

    @GetMapping("/edit")
    public String EditEmployee()
    {
        return "Edit employee page";
    }

    @GetMapping("/search")
    public String SearchEmployee()
    {
        return "Search Employee page";
    }

    @GetMapping("/view")
    public String ViewEmployees()
    {
        return "View Employees page";
    }
}
