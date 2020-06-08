package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * grouper les Employee par Department.
     *
     * @param companies Set de Company
     * @return Map des Employee par Department
     */
    public Map<Department, Set<Employee>> groupByDepartment(Set<Company> companies) {
        Map<Department, Set<Employee>> employeesByDepartment = new HashMap<>();
        return employeesByDepartment;
    }
}
