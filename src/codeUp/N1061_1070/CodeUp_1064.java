package codeUp.N1061_1070;

import java.util.Scanner;

public class CodeUp_1064 {
    // 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
    // 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);

        /*
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println(min);
        */
    }
}