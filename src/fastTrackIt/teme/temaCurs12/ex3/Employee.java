package fastTrackIt.teme.temaCurs12.ex3;

import fastTrackIt.teme.temaCurs12.ex2.exCuEnum2.Person;
import fastTrackIt.teme.temaCurs12.ex2.exCuEnum2.PersonNames;


import java.util.Objects;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(PersonNames name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
