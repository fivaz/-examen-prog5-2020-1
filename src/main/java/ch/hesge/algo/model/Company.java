package ch.hesge.algo.model;

import ch.hesge.algo.model.Exceptions.AlreadyHiredException;
import ch.hesge.algo.model.Exceptions.NotWorkingException;
import ch.hesge.algo.model.Exceptions.WorkForAnotherCompanyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class Company
//        implements Comparable<Company>
{

    private final String name;
    private final List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public String getName() {
        return this.name;
    }

    public void hire(Employee employee, Department department) {
        Optional<Company> optional = employee.getCompany();
        if (optional.isPresent()) {
            if (optional.get() == this) {
                throw new AlreadyHiredException(employee, this);
            } else {
                throw new WorkForAnotherCompanyException(employee, this);
            }
        } else {
            employees.add(employee);
            employee.setCompany(this);
            employee.setDepartment(department);
        }
    }

    public void fire(Employee employee) {
        Optional<Company> optional = employee.getCompany();
        if (optional.isPresent()) {
            if (optional.get() == this) {
                employees.remove(employee);
                employee.setCompany(null);
                employee.setDepartment(null);
            } else {
                throw new NotWorkingException(employee, this);
            }
        } else {
            throw new NotWorkingException(employee, this);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees.size() +
                '}';
    }



//    @Override
//    public int compareTo(Company o) {
//
//                o.getEmployees().size()
////    this.getEmployees().size();
//    }
}