package week5;

public class Pyramid {
    public void Star(int num) {
        for(int i = 0; i < num; i++) {
            // 공백 출력
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            // 다음 행 갈때 2개 증가하므로
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.Star(5);
    }
}
