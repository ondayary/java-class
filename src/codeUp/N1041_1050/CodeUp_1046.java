package codeUp.N1041_1050;

import java.util.Scanner;

public class CodeUp_1046 {
    // 정수 3개를 입력받아 합과 평균을 출력해보자.
    // 단, -2147483648 ~ +2147483647
    // 합과 평균을 줄을 바꿔 출력한다.
    // 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.println(String.format("%.1f", (float)(a + b + c) / 3));
    }
}
