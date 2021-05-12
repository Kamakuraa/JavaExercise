package fastTrackIt.teme.temaCurs12.ex2.exCuEnum2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewPerson newPerson = new NewPerson(List.of(
                new Person(PersonNames.ALEXANDRA, 23, "Blonde"),
                new Person(PersonNames.MARIUS, 33, "Black"),
                new Person(PersonNames.GEORGE, 21, "Brown"),
                new Person(PersonNames.CRISTIANA, 25, "Blonde")
        ));

        System.out.println(newPerson.getPersons());

        System.out.println(newPerson.personName());

        System.out.println(newPerson.nameAndAge());

        System.out.println(newPerson.olderThan(30));

        System.out.println(newPerson.hairColor());


        System.out.println(newPerson.PersonAge());

    }


}
