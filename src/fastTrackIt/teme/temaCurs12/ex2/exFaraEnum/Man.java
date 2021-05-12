package fastTrackIt.teme.temaCurs12.ex2.exFaraEnum;


import java.util.*;

public class Man {
    private final List<Person> people = new ArrayList<>();

    public Man(Collection<Person> peoples) {
        this.people.addAll(peoples);
    }

    public List<Person> getPeople() {
        return people;
    }

    public Map<String, Integer> pers() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : people) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public Map<String, List<Person>> hairColor() {
        Map<String, List<Person>> result = new HashMap<>();
        for (Person person : people) {
            List<Person> exList = result.get(person.getHairColor());
            if (exList == null) {
                exList = new ArrayList<>();
            }
            exList.add(person);
            result.put(person.getHairColor(), exList);
        }
        return result;
    }

    public List<Person> olderThan(int minAge) {
        List<Person> newResult = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= minAge) {
                newResult.add(person);
            }
        }
        return newResult;
    }


}
