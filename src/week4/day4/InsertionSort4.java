package week4.day4;

import java.util.Arrays;

public class InsertionSort4 {
    // 루프 i를 적용한 코드
    public int[] sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if(arr[j] < arr[j -1]) {
                    int temp = arr[j - 1];
                    arr[j - 1]  = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다.
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort4 is = new InsertionSort4();
//        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
