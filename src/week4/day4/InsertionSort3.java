package week4.day4;

import java.util.Arrays;

public class InsertionSort3 {
    // i를 j로 바꾼 코드
    public int[] sort(int[] arr, int i) {
        // i = 1 arr[1] j vs arr[0]
        // i = 2 일때 arr[2] j vs arr[1]
        // i = 2 일때 arr[1] j vs arr[0]

        for(int j = i; j > 0; j--) {
            System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
/*            if(arr[j] < arr[j -1]) {
                // swap
                int temp = arr[j - 1];
                arr[j - 1]  = arr[j];
                arr[j] = temp;
            }*/
        }
        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다.
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort3 is = new InsertionSort3();
//        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = is.sort(arr, 1);

        System.out.println(Arrays.toString(result));
    }
}
/*
재귀(recursive) -- 반복문(while) 없이 반복해야 할 때
함수가 직접 또는 간접적으로 자신을 호출하는 프로세스를 재귀함수라고 합니다.
 */