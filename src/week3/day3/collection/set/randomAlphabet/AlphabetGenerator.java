package week3.day3.collection.set.randomAlphabet;

public class AlphabetGenerator {
    public Character Generate() {

        // 26개의 랜덤한 정수를 만들고
        int randomNum = (int) (Math.random() * 26);
        // A ~ Z에 해당하는 65 ~ 90를 만들기 위해 65를 더한다.
        char alphabet = (char) (randomNum + 65);

        return alphabet;
    }
}
