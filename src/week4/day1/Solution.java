package week4.day1;

public class Solution {
    public int solution(int num)    {
        int result = 0;

        while(num != 0){
            result += num % 10; // num % 10 을 하면 num의 1의 자리수를 구할 수 있다.
            num /= 10; // num /= 10을 하면 일의 자리가 사라진다.
        }
        // 1 ~ 2를 num이 0이 될때까지 반복함으로 모든 자리수를 더할 수 있다.
        return result;
    }
}
