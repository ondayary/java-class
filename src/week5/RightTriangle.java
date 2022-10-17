package week5;

public class RightTriangle {
    public void Star(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.Star(5);
    }
}

    /*
    System.out.println("*");        i = 0 별 1개
    System.out.println("* *");      i = 1 별 2개
    System.out.println("* * *");    i = 2 별 3개
    System.out.println("* * * *");  i = 3 별 4개
    */