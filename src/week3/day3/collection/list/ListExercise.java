package week3.day3.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김민석");
        this.students.add("한소희");
        this.students.add("배수지");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
