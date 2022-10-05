package week3.day2.statement;

public class Calculator {
    // DAO :Data Access Object

    // plus minus multiple divide 4개의 메소드를 만들기
    // 각 메소드 기능은 + - * / 이고
    // 파라메터는 int a, int b 를 받습니다.
    public void plus(int a, int b) {
        System.out.println(a + b);
    }
    public void minus(int a, int b) {
        System.out.println(a - b);
    }
    public void multiple(int a, int b) {
        System.out.println(a * b);
    }
    public void divide(int a, int b) {
        // System.out.println((double) a / b);
        // float : double 보다 작은 그릇
        float result = (float) a / b;
        System.out.println(result);
    }
}
