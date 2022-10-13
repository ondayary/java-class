package codeUp.N1051_1060;

import java.util.Scanner;

public class CodeUp_1055 {
    // 두 개의 참(1) 또는 거짓(0)이 입력될 때,
    // 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a == 1) || (b == 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
/*
논리연산자 || 는 OR 연산이라고도 부르고,
+ 로 표시하며, 집합 기호로는 ∪(합집합, union)을 사용한다. 모두 같은 의미이다.
*/