package codeUp.N1051_1060;

import java.util.Scanner;

public class CodeUp_1054 {
    // 두 개의 참(1) 또는 거짓(0)이 입력될 때,
    // 모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a == 1) && (b == 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
/*
논리연산자 && 는 AND 연산이라고도 부르고, · 으로 표시하거나 생략하며,
집합 기호로는 ∩(교집합, intersection)을 의미한다. 모두 같은 의미이다.

참, 거짓의 논리값(boolean value)인 불 값을 다루어주는 논리연산자는
!(not), &&(and), ||(or) 이 있다.

예시
printf("%d", 1&&1); // 둘 다 참을 의미하므로 1로 계산되어 출력된다.
 */