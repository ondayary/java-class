package week4.day4;

import java.util.Arrays;

public class InsertionSort2 {
    public int[] sort(int[] arr, int i) {
        // i = 1 arr[1] j vs arr[0]
        // i = 2 일때 arr[2] j vs arr[1]
        // i = 2 일때 arr[1] j vs arr[0]
        int j = 2;
        if(arr[j] < arr[j -1]) { // arr[1] vs arr[0]
            // swap
            int temp = arr[j - 1];
            arr[j - 1]  = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다.
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort2 is = new InsertionSort2();
//        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = is.sort(arr, 1);

        System.out.println(Arrays.toString(result));
    }
}
