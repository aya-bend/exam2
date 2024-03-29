package com.example.exam;

import jakarta.persistence.*;
import java.util.Set;
import java.io.Serializable;

@Entity
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Skill skill;
    @ManyToMany
    @JoinTable(
            name = "project_employee",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Set<Employee> employees;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Skill getSkill() {
        return skill;
    }

    public String getEmail() {
        return email;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

}
