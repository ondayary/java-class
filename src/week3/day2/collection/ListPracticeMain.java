package week3.day2.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {

        LikeLion2th likeLion2th = new LikeLion2th();

        List<String> students = likeLion2th.getStudentList();
        List<Student> studentsObjs = likeLion2th.getStudentObjsList();

        /*
        for(String student : students) {
            System.out.println(student);
        }
        // list에 들어있는 element개수 세기
        System.out.println(students.size()); // size() : List에 인터페이스로 구현되어 있는 메소드
         */

        for(Student s : studentsObjs) {
            System.out.println(s.toString());
        }
    }
}
