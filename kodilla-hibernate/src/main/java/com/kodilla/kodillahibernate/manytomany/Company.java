package com.kodilla.kodillahibernate.manytomany;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retriveCompanyByThreeFirstLetters",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT (:letters , '%') ",
        resultClass = Company.class
        )

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "COMPANY_NAME")
    @NotNull
    public String getName() {
        return name;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public void setId(int id) {
        this.id = id;
    }
}
