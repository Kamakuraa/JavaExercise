package fastTrackIt.teme.temaCurs12.ex2.exCuEnum2;

import java.util.*;

public class NewPerson {
    private final List<Person> persons = new ArrayList<>();

    public NewPerson(Collection<Person> persons) {
        this.persons.addAll(persons);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<PersonNames> personName() {
        List<PersonNames> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }


    public Map<PersonNames, Integer> nameAndAge() {
        Map<PersonNames, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<Person> olderThan(int minAge) {
        List<Person> newResult = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                newResult.add(person);
            }
        }
        return newResult;
    }

    public Map<PersonNames, String> hairColor() {
        Map<PersonNames, String> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getHairColor());
        }
        return result;
    }

    public Map<PersonNames, Integer> PersonAge() {
        Map<PersonNames, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }
}
