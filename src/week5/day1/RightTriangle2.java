package week5.day1;

public class RightTriangle2 {
    public void Sharp(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle2 rightTriangle = new RightTriangle2();
        rightTriangle.Sharp(5);
    }
}