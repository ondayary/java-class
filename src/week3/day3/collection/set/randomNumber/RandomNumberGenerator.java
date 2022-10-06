package week3.day3.collection.set.randomNumber;

import week3.day3.collection.set.randomNumber.NumberGenerator;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
