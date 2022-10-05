package week3.day2.codeup;

import java.util.Scanner;

public class CodeUp_1014 {
    // 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.print(str2 + " " + str1);
    }
}
