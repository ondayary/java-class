package codeUp.N1011_1020;

import java.util.Scanner;

public class CodeUp_1019 {
    // 년, 월, 일을 ".(닷)"으로 구분되어 입력받아 yyyy.mm.dd 형식으로 출력
    // (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("[.]");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.println(String.format("%04d.%02d.%02d", year, month, day));
    }
}
