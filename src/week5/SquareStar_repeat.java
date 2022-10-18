package week5;

public class SquareStar_repeat {
    // n을 받으면 n * n 사이즈 사각형 출력
    public void printSquare(int num) {
        for(int i = 0; i < num; i++) {
            System.out.println(" * ".repeat(num));
        }
    }

    public static void main(String[] args) {
        new SquareStar_repeat().printSquare(5);
    }
}
