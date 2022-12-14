package babyLion.date221012;
/*
1. 클래스는 무엇인가?
    Class = 멤버변수(id, address, district ..)에 값을 저장하는 기능 + 동작을 내재화 시키는 기능

2. array 쓰면 되는데 클래스를 왜 쓸까요?
    : 클래스 쓸 때의 이점이 있기 때문이다.
      java는 강타입 언어, javascript는 약타입 언어
      다른 타입으로 실행 중에 바뀌지 않는다는 보장, 변수를 통제하기가 좋다.

    - array는 다양한 type을 소화할 수 없다.
    - 클래스를 쓰게 되면 빈번한 Type Casting을 하지 않아도 된다.
    - 클래스 안에 기능을 넣을 수 있다.
    - 변수(오작동 하는 빈도)를 줄일 수 있다. -- 신뢰성이 다른 언어에 비해서 비교적 높다.
    - 이름을 가지고 접근할 수 있다. index로 접근하지 않아도 된다.(array)
    - 동작을(Method) class안에 내재화 시킬 수 있다. (가장 큰 장점) -- 안에서만 일어나는 연산을 사용할 수 있다.

3. Method는 무엇인가?

4. 다형성이란?
    하나의 코드가 여러 자료형으로 구현되어 실행되는 것을 말한다.
    같은 코드에서 여러 실행 결과가 나오는 것이다.

5. 제네릭이란?
    여러 참조 자료형을 사용할 수 있도록 유연하게 여지를 둘 수 있게 해주는 것이 제네릭이다.
    List<T>
    LineParser<T>
*/

public class WhyClass {
    public static void main(String[] args) {
        String[] arr = new String[7]; // array는 타입이 지정이 되어있다.

        arr[0] = "A1120837";
        arr[1] = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        arr[2] = "서울특별시 금천구";
        arr[3] = "C";
        arr[4] = "2";

        int emergencyRoom = Integer.parseInt(arr[4]);
        // 클래스를 쓰게 되면 빈번한 Type Casting을 하지 않아도 된다.

//        Hospital hospital = new Hospital();
//        hospital.setId("");

        // set을 쓰지 않고 contructor로 하는 방법
        WhyClass2 whyClass2 = new WhyClass2(
                "B1100027",
                "서울특별시 강남구 도산대로 118 (논현동 신사빌딩 2층)",
                "서울특별시 강남구",
                "C",
                2,
                "365엠씨의원",
                null
        );

        // 제네릭이 나온 근본적인 이유 : 꺼낼 때 type casting을 안해도 된다.
        // 특정 class가 의존하고 있는 interface에도 type에 변화를 줄 수 있게 되었다.
    }
}
