package week4.day2.readLine;

public class Hospital {
    private String id; // Contructor로만 초기화 가능

    // 매개변수 있는 생성자
    public Hospital(String id) {
        this.id = id;
    }
    public String getId() { // id값에 접근 가능
        return id;
    }
}
