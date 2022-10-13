package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1023 {
    // 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] str2 = str.split("\\.");
        System.out.println(str2[0] + "\n" + str2[1]);
    }
}
