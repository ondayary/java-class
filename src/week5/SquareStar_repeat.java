package week5;

public class SquareStar {
    // n을 받으면 n * n 사이즈 사각형 출력
    public void printSquare(int num) {
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(5);
    }
}
