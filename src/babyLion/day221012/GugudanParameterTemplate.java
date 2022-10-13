package babyLion.day221012;

interface Operation {
    int operation(int a, int b);
}

public class GugudanParameterTemplate {
    public void printGugudan(int dan, String operator, Operation operation){
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d %s %d = %d\n", dan, operator, operation.operation(dan, i));
        }
    }
    // 다형성
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for(int j = 2; j <= 9; j++){
            gugudan.printGugudan(j);
        }
    }
/*
Lambda
(a, b) -> a + b
(a, b) -> a * b

public void printPlusGugu(int dan) {
        printGugudanTemplate(dan, "+", (a, b) -> a + b);
    }

    public void printMultipleGugu(int dan) {
        printGugudanTemplate(dan, "*", (a, b) -> a * b);
    }
*/

}
