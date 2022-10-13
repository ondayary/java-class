package babyLion.day221012;

public class WhyClass2 {
    // Hospital
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    // 클래스 만드는 이점. 변수(오작동 하는 빈도)를 줄일 수 있다. -- 신뢰성이 다른 언어에 비해서 비교적 높다.
    public WhyClass2(String id, String address, String district, String category,
                     Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
        this.setDistrict();
        // 중요한 점은 Constructor에서 this.setDistrict()를 호출함으로써 district를 만든다는 것이다.
    }

    private void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district = splitted[0] + " " + splitted[1];
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
/*
int와 Integer의 차이
int - Primitive Type
Integer - Reference

primitive가 더 공간을 적게 차지 합니다.
Integer는 Class(Object)이기 때문에 메모리를 더 많이 쓰는데 왜 Integer를 쓸까요?
*/