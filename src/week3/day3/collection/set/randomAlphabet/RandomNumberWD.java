package week3.day3.collection.set.randomAlphabet;

import week3.day3.collection.set.randomNumber.RandomNumberGenerator;
import java.util.HashSet;

public class RandomNumberWD {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> randomNumbers = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            randomNumbers.add(randomNumberGenerator.generate(100));
        }

        System.out.println("중복이 되지 않은 숫자 : " + randomNumbers);
        System.out.println("갯수: " + randomNumbers.size());
    }
    public Character Generate() {

        // 26개의 랜덤한 정수를 만들고
        int randomNum = (int) (Math.random() * 26);
        // A ~ Z에 해당하는 65 ~ 90를 만들기 위해 65를 더한다.
        char alphabet = (char) (randomNum + 65);

        return alphabet;
    }
}


