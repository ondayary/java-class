package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1026 {
    // 입력되는 시:분:초 에서 분만 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String arr[] = str.split("\\:");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int s = Integer.parseInt(arr[2]);

        System.out.println(m);
    }
}
