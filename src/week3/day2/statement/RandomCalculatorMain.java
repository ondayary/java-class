package week3.day2.statement;

import week3.day2.statement.RandomCalculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomCalculator cal = new RandomCalculator(100);

        cal.plus();
        cal.minus();
        cal.multiple();
        cal.divide();
    }
}
