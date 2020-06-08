package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class I {

    /**
     * En utilisant l'API streams,
     * retourner la Company qui comporte le plus grand nombre d'employés.
     *
     * @param companies Set de Company
     * @return La Company qui comporte le plus grand nombre d'employés
     */
    public Company findCompanyWithHighestNumberOfEmployees(Set<Company> companies) {
        Company company = companies.stream()
                .max(Comparator.comparingInt(value -> value.getEmployees().size())).get();
        return company;
    }
}
