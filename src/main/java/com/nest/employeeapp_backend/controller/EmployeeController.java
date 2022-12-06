package com.nest.employeeapp_backend.controller;


import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to employee home page";
    }

    @PostMapping(path= "/add",consumes = "application/json",produces = "application/jsom")
    public String AddEmployee(@RequestBody Employee e)
    {
        System.out.println(e.toString());
        System.out.println("Employee id:"+e.getId());
        dao.save(e);
        return "Added Employee";
    }

    /*@PostMapping("/edit")
    public String EditEmployee()
    {
        return "Edit employee page";
    }

    @PostMapping("/search")
    public String SearchEmployee()
    {
        return "Search Employee page";
    }*/
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewEmployees()
    {
        return (List<Employee>) dao.findAll();
    }

    /*@PostMapping("/delete")
    public String DeleteEmployee()
    {
        return "Delete Employees page";
    }*/

}
