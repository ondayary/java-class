package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1024 {
    // 입력받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            System.out.println("\'" + str.charAt(i) + "\'");
        }
    }
}

