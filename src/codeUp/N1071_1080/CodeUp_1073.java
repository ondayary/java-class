package codeUp.N1071_1080;

import java.util.Scanner;

public class CodeUp_1073 {
    // 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
    // (0은 출력하지 않는다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int number = sc.nextInt();
            if(number == 0) {
                break;
            }
            System.out.println(number);
        }
    }
}
