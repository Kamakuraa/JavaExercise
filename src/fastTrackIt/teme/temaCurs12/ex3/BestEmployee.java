package fastTrackIt.teme.temaCurs12.ex3;


import fastTrackIt.teme.temaCurs12.ex2.exCuEnum2.PersonNames;


import java.util.*;

public class BestEmployee {
    private final List<Employee> persons = new ArrayList<>();

    public BestEmployee(Collection<Employee> newEmployee) {
        this.persons.addAll(newEmployee);
    }

    public List<Employee> getPersons() {
        return persons;
    }

    public int sumOfsalary() {
        List<Integer> result = new ArrayList<>();
        int sal = 0;
        for (Employee employee : persons) {
            result.add(employee.getSalary());
            sal += employee.getSalary();
        }
        return sal;
    }

    public Map<String, List<PersonNames>> personName() {
        Map<String, List<PersonNames>> result = new HashMap<>();
        for (Employee employee : persons) {
            List<PersonNames> exList = result.get(employee.getCompany());
            if (exList == null) {
                exList = new ArrayList<>();

            }
            exList.add(employee.getName());
            result.put(employee.getCompany(), exList);

        }
        return result;
    }
}
