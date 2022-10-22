package codeUp.N1071_1080;

import java.util.Scanner;

public class CodeUp_1074 {
    // 정수 1개가 입력된다.(1 ~ 100)
    // 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i = number; i > 0; i--) {
            // i는 입력받은 값이고, i가 0보다 클때까지, i를 1개씩 줄이면서 출력
            System.out.println(i);
        }
    }
}
