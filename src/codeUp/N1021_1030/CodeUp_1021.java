package codeUp.N1021_1030;

import java.util.Scanner;

public class CodeUp_1021 {
    // 1개의 단어를 입력받아 그대로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        System.out.println(value);
    }
}

/*
   한 단어가 입력된다.
   문자를 50개 저장하기 위해서는 char data[51] 로 선언하면 된다.
   char data[51]="";
   scanf("%s", data);
   실행시 data[51] 에 한 단어가 저장된다.
 */
