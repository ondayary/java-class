package week3.day2.statement;

public class NumberCalculator {
    // 생성자 추가하고 매개변수 없애서
    // 변수를 한번만 할당 후 사칙연산 수행
    private int a;
    private int b;

    // 생성자 추가 alt + insert
    // 값을 클래스 안쪽으로 넣고 싶을 때 생성자를 쓴다.
    public NumberCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void plus() {
        System.out.println(a + b);
    }
    public void minus() {
        System.out.println(a - b);
    }
    public void multiple() {
        System.out.println(a * b);
    }
    public void divide() {
        System.out.println((float) a / b);
    }
}
