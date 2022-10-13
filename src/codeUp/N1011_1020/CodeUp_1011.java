package codeUp.N1011_1020;

import java.util.Scanner;

public class CodeUp_1011 {
    // 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
    // 변수에 저장되어 있는 문자를 그대로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
