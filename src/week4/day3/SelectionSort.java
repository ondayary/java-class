package week4.day3;

public class SelectionSort01 {
    // 선택 정렬 : 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘
    public static void main(String[] args) {

        int[] arr = new int[]{7,2,3,9,28,11};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){ // +1 : 자신 다음 것과 비교
                if(arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j]; // j를 i로 변경
                    arr[j] = temp; // i를 j로 변경
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // 정렬 후 결과 출력
        }
    }
}
