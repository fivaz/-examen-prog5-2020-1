package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

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
        int biggestAge = 0;
        for (Company thisCompany : companies)
            if (thisCompany.getEmployees().size() > biggestSize)
                company = thisCompany;
        return employee;
    }
}
