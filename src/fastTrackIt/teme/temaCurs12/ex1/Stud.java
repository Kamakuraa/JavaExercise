package fastTrackIt.teme.temaCurs12.ex1;


import java.util.*;

public class Stud {
    private final List<Student> student = new ArrayList<>();


    public Stud(Collection<Student> students) {
        this.student.addAll(students);
    }

    public List<Student> getStudents() {
        return student;
    }

    public Map<String, Integer> allGrade() {
        Map<String, Integer> result = new HashMap<>();
        for (Student student : student) {
            result.put(student.getName(), student.getGrade());
        }
        return result;
    }

    public Integer getMaxGrade() {
        List<Integer> newResult = new ArrayList<>();
        for (Student student : student) {
            newResult.add(student.getGrade());
        }
        return Collections.max(newResult);
    }

    /*public Integer getMaxGrade() {
        List<Integer> newResult = new ArrayList<>();
        for (StudentGrade stud : students) {
            newResult.add(stud.getGrade());
        }
        return Collections.max(newResult);
    }*/
}
