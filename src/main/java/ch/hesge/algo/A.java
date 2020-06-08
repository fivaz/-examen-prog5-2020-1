package ch.hesge.algo;

import ch.hesge.algo.model.Company;

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
        Company company = null;
        int biggestSize = 0;
        for (Company thisCompany : companies)
            if (thisCompany.getEmployees().size() > biggestSize)
                company = thisCompany;
        return company;
    }
}
