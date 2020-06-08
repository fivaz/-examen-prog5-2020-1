package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class A {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner la Company qui comporte le plus grand nombre d'employés.
     *
     * @param companies Set de Company
     * @return La Company qui comporte le plus grand nombre d'employés
     */
    public Company findCompanyWithHighestNumberOfEmployees(Set<Company> companies) {
        return Collections.max(companies, Comparator.comparingInt(o -> o.getEmployees().size()));
    }
}
