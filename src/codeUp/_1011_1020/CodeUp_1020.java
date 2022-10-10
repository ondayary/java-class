package codeUp._1011_1020;

import java.util.Scanner;

public class CodeUp_1020 {
    // 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력되면
    // '-'를 제외한 주민번호 13자리를 모두 붙여 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] arr = num.split("[-]");
        System.out.printf("%s%s", arr[0], arr[1]);
    }
}
