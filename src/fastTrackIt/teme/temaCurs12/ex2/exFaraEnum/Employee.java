package fastTrackIt.teme.temaCurs12.ex2.exFaraEnum;


import java.util.HashMap;
import java.util.Map;

public class Employee extends Person {
    public String company;
    public int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String getHairColor() {
        return super.getHairColor();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
