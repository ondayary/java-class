package week4.day2;

import java.util.Arrays;

public class MaxNum {
    // CodeUp 2081
    // 9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = arr[0]; // 최대값 초기화
        int index = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("최대값은 " + max);
        System.out.println("최대값 인덱스는 " + index);
    }
}
