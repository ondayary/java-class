package codeUp.N1061_1070;

import java.util.Scanner;

public class CodeUp_1061 {
    // 입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
    // 비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a | b);
    }
}
/*
비트단위 or 연산은 둘 중 하나라도 1인 자리를 1로 만들어주는 것과 같다.
이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.
*/
