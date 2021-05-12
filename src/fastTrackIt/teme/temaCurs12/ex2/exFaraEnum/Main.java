package fastTrackIt.teme.temaCurs12.ex2.exFaraEnum;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BestEmployee bestEmployee = new BestEmployee(List.of(
                new Employee("Alex", 35, "Brown", "RAR", 1000),
                new Employee("Dan", 36, "Brown", "IBM", 4000),
                new Employee("Cristi", 29, "Black", "UiPath", 3500)
        ));
        System.out.println("__________________________");
        System.out.println(bestEmployee.getNewEmployee());

        System.out.println("__________________________");

        Man man = new Man(List.of(
                new Person("Alex", 35, "brown"),
                new Person("Corina", 22, "blond"),
                new Person("Cristian", 23, "black"),
                new Person("Andreea", 27, "rose")
        ));

        System.out.println(man.getPeople());

        System.out.println(man.pers());

        System.out.println(man.hairColor());

        System.out.println(man.olderThan(30));
        personName(man);

    }

    private static void personName(Man man) {
        for (String name : man.pers().keySet()) {
            System.out.println(name);
        }
    }
}
