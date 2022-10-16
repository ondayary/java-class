package codeUp.N1061_1070;

import java.util.Scanner;

public class CodeUp_1068 {
    // 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
    /* 평가 기준
       90 ~ 100 : A
       70 ~ 89 : B
       40 ~ 69 : C
        0 ~ 39 : D */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 70) {
            System.out.println("B");
        } else if(score >= 40) {
            System.out.println("C");
        } else { // 마지막은 (score >= 0) 조건이 필요없다.
            System.out.println("D");
        }
    }
}
