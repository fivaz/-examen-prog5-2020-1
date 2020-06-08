package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
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
        LocalDate now = LocalDate.now();

        HashSet hashSet = new HashSet<Employee>();
        for(Company company: companies){
            hashSet.addAll(company.getEmployees());
        }

        return Collections.max(hashSet, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(now), o2.getAge(now));
            }
        });
    }
}
