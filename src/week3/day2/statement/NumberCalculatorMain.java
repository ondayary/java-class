package week3.day2.statement;

import week3.day2.statement.NumberCalculator;

public class NumberCalculatorMain {
    public static void main(String[] args) {
        NumberCalculator c = new NumberCalculator(10, 20);

        c.plus();
        c.minus();
        c.multiple();
        c.divide();
    }
}
