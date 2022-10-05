package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // 생성자
    private List<String> students = new ArrayList<>(); // 초기화
    private List<Student> studentObjs = new ArrayList<>();
    public LikeLion2th() {
        Names names = new Names();
        this.students = names.getNames();
        this.studentObjs = names.getStudentObjs();
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList() { // return 해야하니까 반환형은 void가 오면 안됨
        return this.students;
    }
    public List<Student> getStudentObjsList() {
        return this.studentObjs;
    }
}
