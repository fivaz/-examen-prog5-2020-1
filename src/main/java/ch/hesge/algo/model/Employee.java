package ch.hesge.algo.model;

import ch.hesge.algo.model.Exceptions.NotWorkingException;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthdate;
    private Company company;
    private Department department;

    public Employee(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public int getAge(LocalDate date) {
        return Period.between(birthdate, date).getYears();
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Optional<Company> getCompany() {
        return Optional.ofNullable(company);
    }

    public Department getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setCompany(Company company) {
        this.company = company;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    public void quit() {
        if (company == null) {
            throw new NotWorkingException(this);
        }
        company.getEmployees().remove(this);
        company = null;
        department = null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ",company=" + company.getName() + '\'' +
                ", birthdate=" + birthdate +
                ", department=" + department +
                '}';
    }
}