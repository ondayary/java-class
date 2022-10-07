package week3.day3.collection.set.randomAlphabet;

import java.util.HashSet;

public class RandomAlphabetWD {
    // 알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복제거
    public static void main(String[] args) {

        RandomNumberWD randomNumberWD = new RandomNumberWD();
        HashSet<Character> randomAlphabets = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            randomAlphabets.add(randomNumberWD.Generate());
        }

        System.out.println(randomAlphabets);
        System.out.println("갯수: " + randomAlphabets.size());
    }
}
