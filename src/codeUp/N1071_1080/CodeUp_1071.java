package codeUp.N1071_1080;

import java.util.Scanner;

public class CodeUp_1071 {
    // 정수가 순서대로 입력된다.
    // 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int number = sc.nextInt();
            if(number == 0) { // 입력된 정수가 0이라면
                break; // 빠져나간다.
            }
            // 입력한 정수 출력하기
            System.out.println(number);
        }
    }
}
