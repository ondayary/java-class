package codeUp.N1071_1080;

import java.util.Scanner;

public class CodeUp_1072 {
    // 첫 줄에 정수의 개수 n이 입력되고,
    // 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 안에 입력 받은 정수들을 할당한다.
        int number = sc.nextInt();
        int[] arr = new int[number];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt(); // 정수의 개수 n출력
            System.out.println(arr[i]); // n개의 정수 출력
        }
    }
}
