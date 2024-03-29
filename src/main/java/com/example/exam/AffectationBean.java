package com.example.exam;

import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class AffectationBean {
    private String employeeName;
    private String projectName;
    private int implicationPercentage;

    @EJB
    private EmployeeDAO employeeDAO;

    @EJB
    private ProjectDAO projectDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public List<Project> getAllProjects() {
        return projectDAO.getAllProjects();
    }

    public void affecterProjet() {
        // Logique pour affecter le projet
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getImplicationPercentage() {
        return implicationPercentage;
    }

    public void setImplicationPercentage(int implicationPercentage) {
        this.implicationPercentage = implicationPercentage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
