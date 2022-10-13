package codeUp.N1051_1060;

import java.util.Scanner;

public class CodeUp_1053 {
    // 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
    // 반대로 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        if(input == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
/*
참 또는 거짓의 논리값을 역(반대)으로 바꾸기 위해서는
논리(logical)연산자 !를 사용할 수 있다.

이러한 논리연산을 NOT 연산이라고도 부르고,
프라임(기호 오른쪽에 따옴표) 이나 바(기호 위에 가로 막대)로 표시하고,
집합 기호로는 c (여집합, complement)를 의미한다. 모두 같은 의미이다.

참, 거짓의 논리값(boolean value)인 불 값을 다루어주는 논리연산자는
!(not), &&(and), ||(or) 이 있다.

예시
printf("%d", !0); //거짓의 반대, 즉 참인 1로 계산됨
printf("%d", !1); //참의 반대, 즉 거짓인 0으로 계산됨
printf("%d", !999); //참의 반대, 즉 거짓인 0으로 계산됨

어떤 변수 a에, !a 와 같은 논리 연산이 가능하다.
 */