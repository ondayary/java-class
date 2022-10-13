package week4.day2;

interface isCompare {
    boolean isCompare(int a, int b);
}
public class MaxMinContext {
    boolean isBigger(int a, int b){
        return a > b;
    }
    boolean isShorter(int a, int b){
        return a < b;
    }

    public int[] getNum(int[] arr){
        int maxIndex = 0;
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{maxValue, maxIndex};
    }
}
