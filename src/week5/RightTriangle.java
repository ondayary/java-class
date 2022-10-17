package week5;

public class RightTriangle {
    public void Star(int num) {
        for(int i = 1; i < num; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
    System.out.println("*");        i = 0 별 1개
    System.out.println("* *");      i = 1 별 2개
    System.out.println("* * *");    i = 2 별 3개
    System.out.println("* * * *");  i = 3 별 4개
    */
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.Star(5);
    }
}
