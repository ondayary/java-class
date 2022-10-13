package week4.day2;

import java.util.Arrays;

public class MaxNum2 {
    // CodeUp 4596
    // 2차원 배열
    // arr을 받아서 최대값 구한 후 int로 리턴
    // 자동정렬 : cmd + opt + L

    /*
    3 23 85 34 17 74 25 52 65
    10 7 39 42 88 52 14 72 63
    87 42 18 78 53 45 18 84 53
    34 28 64 85 12 16 75 36 55
    21 77 45 35 28 75 90 76 1
    25 87 65 15 28 11 37 28 74
    65 27 75 41 7 89 78 64 39
    47 47 70 45 2 3 65 3 41 44
    87 13 82 38 31 12 29 29 80
    */

    // 리턴값 : maxValue, maxIndex
    public int[] getMax(int[] arr) {
        int maxValue = arr[0]; // arr이 모두 음수이 경우 0으로 하면 0이 max
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{maxValue, maxIndex};
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };

        // loop를 돌아야 한다. 9 * 9
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                // 코드를 만들기 전에 어떻게 돌지 설계 단계를 거쳐야 한다
//
//                // 가로 순회
//                int a = arr[i][j]; // j가 먼저 바뀐다
//                // j가 0 ~ 9까지 한번 돌면 i가 1씩 올라간다
//                System.out.println("a = " + a); // 첫줄 찍어보기
//
//                // 세로 순회
//                int b = arr[j][i];
//                System.out.println("b = " + b);

                int maxValue = arr[0][0];
                int[] maxIndex = {0,0}; // i, j
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if(arr[i][j] > maxValue) {
                            maxValue = arr[i][j];
                            maxIndex[0] = i;
                            maxIndex[1] = j;
                        }
                    }
                }
        System.out.println(maxValue);
        System.out.println(Arrays.toString(maxIndex));
    }
}
