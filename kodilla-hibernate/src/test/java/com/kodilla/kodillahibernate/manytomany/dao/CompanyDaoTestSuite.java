package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee mateusz = new Employee("Mateusz", "Wojtas");
        Employee tomek = new Employee("Tomek", "Blis");
        Employee marta =  new Employee("Marta", "Bizon");

        Company zabka = new Company("Zabka");
        Company tesco = new Company("Tesco");
        Company abc = new Company("ABC");

        zabka.getEmployees().add(mateusz);
        zabka.getEmployees().add(marta);
        tesco.getEmployees().add(marta);
        abc.getEmployees().add(mateusz);
        abc.getEmployees().add(tomek);

        mateusz.getCompanies().add(zabka);
        mateusz.getCompanies().add(abc);
        marta.getCompanies().add(zabka);
        marta.getCompanies().add(tesco);
        tomek.getCompanies().add(abc);

        //When
        companyDao.save(zabka);
        int zabkaID = zabka.getId();
        companyDao.save(tesco);
        int tescoID = tesco.getId();
        companyDao.save(abc);
        int abcID = abc.getId();

        List<Company> companyList = companyDao.retriveCompanyByThreeFirstLetters("zab");
        List<Employee> employeeList = employeeDao.retriveEmployeesByName("Wojtas");

        //Then
        assertNotEquals(0, zabkaID);
        assertNotEquals(0, tescoID);
        assertNotEquals(0, abcID);
        assertEquals(1, employeeList.size());
        assertEquals(1, companyList.size());

        //Clean Up
        try {
            companyDao.deleteAll();
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
