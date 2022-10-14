package week4.day4;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        int i = 1;

        return new int[]{};
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다. i
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort insertionSrot = new InsertionSort();
        int[] result = insertionSrot.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
