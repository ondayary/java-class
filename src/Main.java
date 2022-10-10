public class Main {
    public static void main(String[] args) {

//        String a = "hello";
//        String b = "daon";
//        System.out.println(a + b);

        Main main = new Main(); // 메인 클래스 자기 자신을 선언
        main.strCombine("java", "main");
    }
    // 메소드로 분리해보자
    public void strCombine(String a, String b) { // 어디선가 메소드를 호출할 때 넣어줄 타입과 변수명을 준비한다.
        String result = a + b;
        System.out.println(result);
    }
}