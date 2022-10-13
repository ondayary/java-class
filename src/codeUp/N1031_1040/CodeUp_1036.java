package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1036 {
    // 영문자 1개 입력받아 10진수로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char value = sc.nextLine().charAt(0);
        int result = (int)value;

        System.out.println(result);
    }
}
/*
아스키 코드는 영문자, 특수 문자 등을 저장할 때 사용하는 표준 코드이다.
(ASCII, 미국표준코드, American Standard Code for Information Interchange)

컴퓨터로 저장되는 모든 데이터는 2진 정수화되어 저장되는데,
영문자와 특수기호 등을 저장하는 방법으로 아스키코드가 기본적으로 사용된다.

예를 들어 영문 대문자 "A"는 10진수 65를 의미하는 2진수 값으로 저장된다.
*/
