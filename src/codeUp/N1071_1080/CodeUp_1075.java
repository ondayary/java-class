package codeUp.N1071_1080;

import java.util.Scanner;

public class CodeUp_1075 {
    // 정수 1개가 입력된다.(1 ~ 100)
    // 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i = number - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
