package com.example.exam;

import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;

@ManagedBean
@RequestScoped
public class EmployeeBean {
    @EJB
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public void removeEmployee(Employee employee) {
        employeeDAO.removeEmployee(employee);
    }
}