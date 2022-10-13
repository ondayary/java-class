package babyLion.date221012;

public class Patient {
    // 생성자가 없으면 java가 자동으로 parameter가 없는 생성자를 실행합니다.

    private String id;

    // 자동으로 만들어주는 기본생성자
    public Patient() { }

    // parameter가 있는 생성자
    public Patient(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

