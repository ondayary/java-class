package codeUp.N1031_1040;

import java.util.Scanner;

public class CodeUp_1034 {
    // 입력받은 8진수 10진수로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int value = Integer.valueOf(str,8); // int type 16진수로 변환
        System.out.printf("%d", value);
    }
}
/*
sc.next()를 Integer.valueof(a, n)의 변수 안에 넣는 방법이 사용될 수 있다.
n의 값에 따라 n진수로 만들 수 있다.
sc.nextInt()를 사용했을 때는 오류가 발생

%o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
%d로 출력하면 10진수로 출력된다.
*/
