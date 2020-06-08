package ch.hesge.algo;

import ch.hesge.algo.model.Employee;

import java.util.HashSet;
import java.util.Set;

public class H {

    /**
     * Modifier la classe Employee pour que le code suivant contienne le nombre d'éléments indiqués.
     */
    public void manageUnicityOfEmployees() {
        Set<Employee> employees = new HashSet<>();
        employees.add(Sample.JOHN);  // Nombre d'éléments -> 1
        employees.add(Sample.JOHN_BIS);  // Nombre d'éléments -> 1
        employees.add(Sample.JOHN2);  // Nombre d'éléments -> 2
        employees.add(Sample.JANE);  // Nombre d'éléments -> 3
    }
}
