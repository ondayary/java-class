package week4.day3;

import java.util.Arrays;

public class BubbleSort_DoubleFor {
    // 이중 for문 적용
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // 7 vs 2
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};

        BubbleSort_DoubleFor bs = new BubbleSort_DoubleFor();
        int[] result = bs.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
