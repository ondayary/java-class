package babyLion.day221012;
/*
다형성 - 동작이 바뀌거나 return type이 바뀔 때 사용한다.
     - parameter로 Class를 받는다.(callback)

parameter - 특정 값만 바뀔 때 추상화 하는 방법이다.
          - ex) 구구단에서 '단'만 바뀔 때 사용한다.
*/

public class Gugudan {
    public void printGugudan(int dan) {
        for(int i = 1; i <= 9; i++) {
            System.out.println(dan * i);
        }
    }
    // 다형성
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        // gugudan.printGugudan(3);
        for(int j = 2; j <= 9; j++) {
            gugudan.printGugudan(j);
        }
    }
}
