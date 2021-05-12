package fastTrackIt.teme.temaCurs12.ex3;


import fastTrackIt.teme.temaCurs12.ex2.exCuEnum2.PersonNames;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        BestEmployee bestEmployee = new BestEmployee(List.of(
                new Employee(PersonNames.ALEXANDRA, 23, "Blonde", "UiPath", 1500),
                new Employee(PersonNames.CRISTIANA, 32, "Black", "ING", 2500),
                new Employee(PersonNames.GEORGE, 30, "Brown", "Luxoft", 900),
                new Employee(PersonNames.ALEXANDRA, 34, "Blonde", "Coca Cola", 1700)
        ));

        System.out.println(bestEmployee.getPersons());
        System.out.println(bestEmployee.sumOfsalary());
        System.out.println(bestEmployee.personName());
    }
}
