package codeUp.N1011_1020;

import java.util.Scanner;

public class CodeUp_1015 {
    // 결과를 소수점 셋째 자리에서 반올림 해, 소숫점 이하 둘째 자리까지 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.printf("%.2f", num);
    }
}
