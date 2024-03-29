package com.example.exam;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class ProjectDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Project> getAllProjects() {
        return entityManager.createQuery("SELECT p FROM Project p", Project.class).getResultList();
    }
}
