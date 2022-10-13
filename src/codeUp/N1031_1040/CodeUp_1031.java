package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1031 {
    // 입력받은 10진수 8진수로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(Integer.toOctalString(num));
    }
}
/*
%d(10진수 형태)로 입력받고,
%o를 사용해 출력하면 8진수(octal)로 출력된다.
*/
