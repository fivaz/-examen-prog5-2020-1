package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

import java.time.LocalDate;
import java.util.Set;

public class B {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner l'employé le plus agé à la date du jour.
     * Pour récupérer la date du jour, utiliser LocalDate.now()
     *
     * @param companies Set de Company
     * @return Employee le plus âgé
     */
    public Employee findOldestEmployee(Set<Company> companies) {
        Employee employee = null;
        LocalDate now = LocalDate.now();
        int biggestAge = 0;
        for (Company thisCompany : companies)
            for (Employee thisEmployee : thisCompany.getEmployees()) {
                if (thisEmployee.getAge(now) > biggestAge) {
                    employee = thisEmployee;
                    biggestAge = thisEmployee.getAge(now);
                }
            }
        return employee;
    }
}
