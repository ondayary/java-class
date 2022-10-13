package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1038 {
    // 정수 2개 입력받아 합 출력하기
    // (단, 입력되는 정수는 -1073741824 ~ 1073741824)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long first = sc.nextLong();
        long second = sc.nextLong();

        System.out.printf("%d", first + second);
    }
}
