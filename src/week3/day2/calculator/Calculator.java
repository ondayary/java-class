package week3.day2.calculator;

public class Calculator {
    // NumberGenerator 에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력
    private NumberCreator numberCreator;
    private int baseNum;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10;
    }

    // 메소드 오버로딩
    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.create(baseNum));
    }
}
