package week4.day1;

public class SumOfDight {
    // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    public int solution(int num) {
        return 0;
    }

    public static void main(String[] args) {
        SumOfDight sod = new SumOfDight();
        int result = sod.solution(831);

        if(result == 10){
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result);
        }
    }
}
