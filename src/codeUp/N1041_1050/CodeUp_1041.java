package codeUp.N1041_1050;

import java.util.Scanner;

public class CodeUp_1041 {
    // 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
    // 영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.nextLine().charAt(0);
        System.out.println((char)(input + 1));
    }
}
/*
숫자는 수를 표현하는 문자로서 '0' 은 문자 그 자체를 의미하고, 0은 값을 의미한다.
아스키문자표에서 'A'는 10진수 65로 저장되고 'B'는 10진수 66으로 저장된다.
따라서 문자도 값으로 덧셈을 할 수 있다.
 */