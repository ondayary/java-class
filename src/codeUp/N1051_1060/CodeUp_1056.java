package codeUp.N1051_1060;

import java.util.Scanner;

public class CodeUp_1056 {
    // 두 가지의 참(1) 또는 거짓(0)이 입력될 때,
    // 참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a == 1 && b == 0) || (a == 0 && b ==1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
/*
이러한 논리연산을 XOR(exclusive or, 배타적 논리합)연산이라고도 부른다.
집합의 의미로는 합집합에서 교집합을 뺀 것을 의미한다. 모두 같은 의미이다.

논리연산자는 사칙연산자와 마찬가지로 여러 번 중복해서 사용할 수 있는데,
연산의 순서를 만들어주기 위해 괄호 ( )를 사용해 묶어 주면 된다.
*/
