package com.nest.employeeapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="employees")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;
    private String designation;
    private int salary;
    private String companyname;
    private String phone;
    private String username;
    private String password;

    public Employee(){}

    public Employee(int id, int empcode, String name, String designation, int salary, String companyname, String phone, String username, String password) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyname = companyname;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
