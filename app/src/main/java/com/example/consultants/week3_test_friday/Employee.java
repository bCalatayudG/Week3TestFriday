package com.example.consultants.week3_test_friday;

public class Employee {
    private String id;
    private Employee[] employees;
    private boolean manager = false;
    private String managerId;
    private boolean hasManager = false;

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
        manager = true;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public boolean isManager() {
        return manager;
    }

}
