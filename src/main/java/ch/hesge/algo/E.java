package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class E {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner une Company fusionnée dont le nom est la concaténation du nom de toutes les Company séparés par " & "
     * et dont les Employee consistent en l'union des Employee de toutes les Company.
     * Chaque employé doit garder le même firstName, lastName, birthdate et department ! Seul la company change !
     * <p>
     * Par exemple :
     * <p>
     * Soit la Company "Foo" qui a pour Employee Alice et Bob
     * Soit la Company "Bar" qui a pour Employee Charles
     * <p>
     * La Company retournée doit avoir :
     * <p>
     * Pour nom "Foo & Bar"
     * Pour Employee Alice, Bob et Charles
     *
     * @param companies Company
     * @return Company fusionnée
     */
    public Company merge(Set<Company> companies) {
        Company company;
        StringBuilder companyName = new StringBuilder();
        D d = new D();
        Map<Department, Set<Employee>> departmentSetMap = d.groupByDepartment(companies);
        for (Company company1 : companies)
            companyName.append(company1.getName()).append(" & ");

        companyName.setLength(companyName.length() - 3);
        company = new Company(companyName.toString());
        for (Map.Entry<Department, Set<Employee>> entry : departmentSetMap.entrySet()) {
            for (Employee employee : entry.getValue()) {
                Optional<Company> company1 = employee.getCompany();
                company1.ifPresent(value -> value.fire(employee));
                company.hire(employee, entry.getKey());
            }
        }
        return company;
    }
}
