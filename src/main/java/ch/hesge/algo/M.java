package ch.hesge.algo;

import ch.hesge.algo.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class M {

    /**
     * En utilisant uniquement l'API streams,
     * retourner une List d'Employee dont les éléments sont triés par birthdate ascendante
     * (le plus jeune est le premier élément).
     *
     * @param employees Collection d'Employee
     * @return Liste d'Employee triés par birthdate ascendante
     */
    public List<Employee> sortByBirthdate(Collection<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getBirthdate))
                .collect(Collectors.toList());
    }
}
