package codeUp.N1041_1050;

import java.util.Scanner;

public class CodeUp_1048 {
    // 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
    // 0 <= a <= 10, 0 <= b <= 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a << b);
    }
}
