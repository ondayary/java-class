package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1040 {
    // 입력받은 정수 부호 바꿔서 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // sc.nextInt * -1
        System.out.println(-num);
    }
}
/*
단항 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대로 바뀌어 계산된다.
*/