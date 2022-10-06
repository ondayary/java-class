package week3.day3.collection.set.randomNumber;

import week3.day3.collection.set.randomNumber.RandomNumberGenerator;

import java.util.HashSet;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        // 중복제거
        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Character> characters = new HashSet<>();

        for(int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            numbers.add(r);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());

        for (int i = 0; i < 26; i++) {
            char alphabet = (char) (randomNumberGenerator.generate(26) + 65);
            characters.add(alphabet);
        }

        System.out.println(characters);
        System.out.println(characters.size());
    }
}
