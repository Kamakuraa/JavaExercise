package fastTrackIt.teme.temaCurs12.ex2.exFaraEnum;


import java.util.*;

public class BestEmployee {
    private final List<Person> newEmployee = new ArrayList<>();

    public BestEmployee(Collection<Person> newEmployee) {
        this.newEmployee.addAll(newEmployee);
    }

    public List<Person> getNewEmployee() {
        return newEmployee;
    }
}