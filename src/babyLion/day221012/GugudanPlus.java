package babyLion.day221012;

public class GugudanPlus {
    public static void main(String[] args) {
        /*
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
        */

        // 구구단 플러스 버전
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " + " + j + " = " + (i + j));
            }
            System.out.println();
        }
    }
}
