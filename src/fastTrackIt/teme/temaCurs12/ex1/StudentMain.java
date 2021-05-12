package fastTrackIt.teme.temaCurs12.ex1;


import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Stud student = new Stud(List.of(
                new Student("Ana", 9),
                new Student("Andrei", 9),
                new Student("Maria", 6),
                new Student("George", 10),
                new Student("Cristian", 5)

        ));

        System.out.println(student.getStudents());

        System.out.println(student.allGrade());

        System.out.println(student.getMaxGrade());
    }
}
