package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Sample {

    public static final Employee JOHN = new Employee("John", "Doe", LocalDate.of(1970, 1, 1));
    public static final Employee JOHN_BIS = new Employee("John", "Doe", LocalDate.of(1970, 1, 1));
    public static final Employee JANE = new Employee("Jane", "Doe", LocalDate.of(1971, 1, 1));
    public static final Employee JOHN2 = new Employee("John", "Doe", LocalDate.of(1980, 1, 1));
    public static final Employee ERIC = new Employee("Eric", "Meyer", LocalDate.of(1950, 1, 1));
    public static final Employee SARAH = new Employee("Sarah", "Meyer", LocalDate.of(1940, 1, 1));
    public static final Employee BOB = new Employee("Bob", "Doe", LocalDate.of(1930, 1, 1));
    public static final Employee BILL = new Employee("Bill", "Doe", LocalDate.of(1920, 1, 1));

    public static final Company FOO = new Company("Foo");
    public static final Company BAR = new Company("Bar");
    public static final Company BAZ = new Company("Baz");

    static {
        FOO.hire(JOHN, Department.ENGINEERING);
        FOO.hire(JOHN2, Department.SALES);
        FOO.hire(SARAH, Department.ENGINEERING);
        BAR.hire(JANE, Department.MARKETING);
        BAZ.hire(ERIC, Department.SALES);
    }

    public static void main(String[] args) {
//        Set<Company> companies = new HashSet<>();
//        companies.add(FOO);
//        companies.add(BAR);
//        companies.add(BAZ);

        Set<Employee> employes = new HashSet<>();
        employes.add(JOHN);
        employes.add(JOHN_BIS);
        employes.add(JANE);
        employes.add(JOHN2);
        employes.add(ERIC);
        employes.add(SARAH);
        employes.add(BOB);
        employes.add(BILL);

//        A a = new A();
//        System.out.println(a.findCompanyWithHighestNumberOfEmployees(companies));

//        B b = new B();
//        System.out.println(b.findOldestEmployee(companies));

        C c = new C();
        Company company = new Company("Company qui recrute");
        c.hireUnemployedEmployees(company, employes);
        System.out.println(company);
        for(Employee empl: company.getEmployees()){
            System.out.println(empl);
        }
    }
}
