package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1027 {
    // 년월일(yyyy.mm.dd)를 입력받아
    // 일월년(dd-mm-yyyy)로 출력
    // (단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next(); // 입력받은 값을 input에 넣기
        String[] output = input.split("\\."); // String.split으로 문자열 배열로 나눔

        System.out.println(output[2] + "-" + output[1] + "-" + output[0]);
    }
}
