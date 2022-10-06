package week3.day3.map;

import java.util.HashMap;

public class AlphabetCount {
    public static void main(String[] args) {
        AlphabetCount alphabetCount = new AlphabetCount();
        String s1 = "abcdefghi//".toUpperCase(); // 소문자 -> 대문자

        // String 한글자씩 출력
        // System.out.println(s1.charAt(0)); // a
        // System.out.println(s1.charAt(s1.length() -1)); // z

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char ch = 'A'; ch < 'Z'; ch++) {
            alphabetMap.put(Character.valueOf(ch), 0);
        }

        // 반복문을 인덱스 길이만큼 돌리면 될 것
        for(int i = 0; i < s1.length(); i++) {

            // 문자열 문자로 변환
            System.out.print(s1.charAt(i) + " ");
            char ch = s1.charAt(i);

            // 알파벳 판단
            boolean isAlphabet = alphabetCount.isAlphabet(ch);

            // 여기에서만 개수를 센다
            if(isAlphabet) {
                alphabetMap.put(ch, alphabetMap.get(ch) + 1);
            }
        }
        System.out.println(alphabetMap);
    }

        // 알파벳인지 판단은 어떻게?
        // ascii code표 : 대문자 65 ~ 90, 소문자 97 ~ 122
        public boolean isAlphabet(char ch) {
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                return true;
            }
            return false;
        }
    }

