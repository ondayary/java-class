package codeUp.N1061_1070;

import java.util.Scanner;

public class CodeUp_1067 {
    // 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
    // 첫 줄에 minus 나 plus 를 출력하고, 두 번째 줄에 odd 나 even 을 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input < 0) { // 음수라면
            System.out.println("minus");

            if(input % 2 == 0) { // 짝수라면
                System.out.println("even");
            } else { // 음수라면
                System.out.println("odd");
            }
        } else { // 양수라면
            System.out.println("plus");

            if(input % 2 == 0) { // 짝수라면
                System.out.println("even");
            } else { // 음수라면
                System.out.println("odd");
            }
        }
    }
}
