package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1035 {
    // 입력받은 16진수 8진수로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hexNum = sc.nextLine();

        // 문자열 hexNum을 16진수로 바꾸기
        int num = Integer.parseInt(hexNum, 16);

        // int num을 8진수로 바꾸기
        String octNum = Integer.toOctalString(num);

        System.out.println(octNum);
    }
}
/*
%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.
*/
