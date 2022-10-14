package week4.day3;

import java.util.Arrays;

public class BubbleSort01 {
    // 버블 정렬 : 두 인접한 원소를 검사하여 정렬하는 방법

    // 조건1. static method는 main말고는 사용 불가
    // 조건2. int형 array를 return하고 int형 array를 받는 sort() 메소드를 만들 것
    public int[] sort(int[] arr, int i) {

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) { // 7 vs 2
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};

        BubbleSort01 bs = new BubbleSort01();
        int[] result = bs.sort(arr, 0);

        // i를 0,1,2,3,4번까지 반복을 해줘야 한다.
        result = bs.sort(new int[]{2, 7, 3, 9, 28, 11}, 1);
        System.out.println(Arrays.toString(result));

        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 2);
        System.out.println(Arrays.toString(result));

        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 3);
        System.out.println(Arrays.toString(result));

        result = bs.sort(new int[]{2, 3, 7, 9, 28, 11}, 4);
        System.out.println(Arrays.toString(result));
    }
}
