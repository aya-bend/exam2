package com.example.exam;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EmployeeDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    public void removeEmployee(Employee employee) {
        entityManager.remove(entityManager.merge(employee));
    }
}