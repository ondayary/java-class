package week3.day4;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // Constructor : fromSido, toSido를 받아서 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // PopulationMove Constructor 오버로딩
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    // Getter
    public int getFromSido() {
        return fromSido;
    }
    public int getToSido() {
        return toSido;
    }

    // Parse
    public void parse() { }
}

/*
[ 설계 ]
Method 이름 단일책임의 원칙 Solid Single Responsibility
1. filename을 받아서 파일을 읽는 기능 - read(String filename)
2. 읽은 파일로 ,로 split을 하는 기능
3. 한 줄의 데이터를 PopulationMove 로 만드는 기능

기능(Method, Function)을 여러개 만들어서 조합하는 것이 프로그래밍
메소드 이름은 그 기능이 어떤 기능을 하는지 알 수 있도록 짓는게 좋다.

컴파일 : 사람이 짠 소스코드를 컴퓨터가 빠르게 읽을 수 있게 변환 하는 것
javac - 컴파일 명령 IntelliJ 가 자동으로 해준다.

논리적 설계 : 기능이 어떤 것인지 써보는 것
물리적 설계 : 자바로 코딩하면 어떤 모양이 될 것인지 써보는 것
구현 : 설계 해놓은 것으로 코딩
*/
