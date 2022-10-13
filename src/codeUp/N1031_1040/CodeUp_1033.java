package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1033 {
    // 입력받은 10진수 16진수 대문자로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(Integer.toHexString(num).toUpperCase());
    }
}
/*
%d(10진수 형태)로 입력받고
%X로 출력하면 16진수(hexadecimal) 대문자로 출력된다.

10진법은 한 자리에 10개(0 1 2 3 4 5 6 7 8 9)의 문자를 사용하고,
16진법은 한 자리에 16개(0 1 2 3 4 5 6 7 8 9 A B C D E F)의 문자를 사용한다.
(알파벳 대소문자는 표현만 다르고 같은 값을 의미한다.)
16진법의 A는 10진법의 10, B는 11, C는 12 ... 와 같다.
 */