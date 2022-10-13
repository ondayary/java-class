package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1025 {
    // 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] output = input.toCharArray();
        // String.toCharArray메소드로 char[] type으로 변환

        System.out.println("[" + output[0] + "0000]");
        System.out.println("[" + output[1] + "000]");
        System.out.println("[" + output[2] + "00]");
        System.out.println("[" + output[3] + "0]");
        System.out.println("[" + output[4] + "]");
    }
}

