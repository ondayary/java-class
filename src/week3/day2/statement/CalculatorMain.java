package week3.day2.statement;

import week3.day2.statement.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(8,3);
        calculator.minus(8,3);
        calculator.multiple(8,3);
        calculator.divide(3,6); // result 0.5 나오게
    }
}
