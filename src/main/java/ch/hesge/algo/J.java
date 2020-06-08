package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J {

    /**
     * En utilisant uniquement l'API streams,
     * retourner l'employé le plus agé à la date du jour.
     * Pour récupérer la date du jour, utiliser LocalDate.now()
     *
     * @param companies Set de Company
     * @return Employee le plus âgé
     */
    public Employee findOldestEmployee(Set<Company> companies) {
        Stream<Employee> employeeStream = companies.stream().flatMap(company -> company.getEmployees().stream());
        return employeeStream.min(Comparator.comparing(Employee::getBirthdate)).get();
    }
}
