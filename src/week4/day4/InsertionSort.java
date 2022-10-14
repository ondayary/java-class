package week4.day4;

import java.util.Arrays;
/*
삽입 정렬 : 삽입 정렬은 두 번째 자료부터 시작하여 그 앞(왼쪽)의 자료들과 비교하여
삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘이다.
 */
public class InsertionSort {
    public int[] sort(int[] arr) {
        int i = 1;
        int tmp  = 0;
        if(arr[i] < arr[i -1]) { // arr[1] vs arr[0]
            // swap
            tmp = arr[i];
            arr[i]  = arr[i - 1];
            arr[i - 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다.
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
