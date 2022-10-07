package week3.day3.collection.map;

import java.util.HashMap;

public class MapExercise2 {

    // String s에 있는 a ~ z까지 알파벳의 개수를 세는 알고리즘을 구현 해보세요.
    // 대소문자는 구별하지 않습니다.
    public static void main(String[] args) {

        String address = "https://github.com/ondayary/java-class.git";
        address = address.toUpperCase();

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) >= 65 && address.charAt(i) < 97) {
                alphabetCnt.put(address.charAt(i), alphabetCnt.getOrDefault(address.charAt(i), 0) + 1);
            }
        }

        System.out.println("사용된 알파벳의 개수 : " + alphabetCnt.size());
        System.out.println("각 알파벳의 개수 : " + alphabetCnt);


    }
}
