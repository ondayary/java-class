package week5;

public class RectangleStar {
    // x, y를 받으면 x * y사이즈의 사각형 출력하기
    public void printRectangle(int x, int y) {
        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RectangleStar squareStar = new RectangleStar();
        squareStar.printRectangle(5, 3);
    }
}
