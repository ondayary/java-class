package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1039 {
    // 입력받은 두 개의 정수의 합을 출력
    // 단, 입력되는 정수는  -2147483648 ~ +2147483648 이므로 long형으로 데이터를 입력받는다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long first = sc.nextLong();
        long second = sc.nextLong();

        System.out.println(first + second);
    }
}
/*
int 데이터형은 %d로 입출력하고,
long long int 데이터형은 %lld로 입출력한다.
*/
