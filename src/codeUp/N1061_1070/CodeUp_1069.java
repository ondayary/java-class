package codeUp.N1061_1070;

import java.util.Scanner;

public class CodeUp_1069 {
    // 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
    /* A : best!!!
       B : good!!
       C : run!
       D : slowly~
       나머지 문자들 : what? */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch  = sc.next().charAt(0);

        switch(ch) {
            case 'A' :
                System.out.println("best!!!");
                break;
            case 'B' :
                System.out.println("good!!");
                break;
            case 'C' :
                System.out.println("run!");
                break;
            case 'D' :
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}
