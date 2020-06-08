package ch.hesge.algo.model;

import java.time.LocalDate;

public class Exceptions {

    public static class NotWorkingException extends RuntimeException {

        public NotWorkingException(Employee employee) {
            super("Employee "
                    + employee.getFirstName()
                    + " "
                    + employee.getLastName()
                    + " cannot quit "
                    + employee
                    + " as s/he's not working");
        }

        public NotWorkingException(Employee employee, Company company) {
            super("Company "
                    + company.getName()
                    + " cannot fire "
                    + employee.getFirstName()
                    + " "
                    + employee.getLastName()
                    + " as the latter is working for company "
                    + employee.getCompany().orElse(null));
        }

    }

    public static class AlreadyHiredException extends RuntimeException {

        public AlreadyHiredException(Employee employee, Company company) {
            super("Employee "
                    + employee.getFirstName()
                    + " "
                    + employee.getLastName()
                    + " cannot be hired, as s/he already works for company "
                    + company.getName());
        }
    }

    public static class WorkForAnotherCompanyException extends RuntimeException {

        public WorkForAnotherCompanyException(Employee employee, Company company) {
            super("Company "
                    + company.getName()
                    + " cannot hire employee "
                    + employee.getFirstName()
                    + " "
                    + employee.getLastName()
                    + " as the latter is already working for company "
                    + employee.getCompany().orElse(null));
        }
    }
}