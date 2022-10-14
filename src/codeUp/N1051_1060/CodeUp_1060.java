package codeUp.N1051_1060;

import java.util.Scanner;

public class CodeUp_1060 {
    // 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
    // 비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a & b);
    }
}
/*
비트단위 and 연산은 두 비트열이 주어졌을 때,
둘 다 1인 부분의 자리만 1로 만들어주는 것과 같다.
*/