package week3.day2.statement;

public class RandomCalculator {

    // 각 메소드는 parameter를 int형 하나만 받습니다.
    // ex) a + random한 정수 숫자 =
    // randomNumber는 0~9사이의 정수

    // plus a + randomNumber
    // minus - randomNumber
    // multiple * randomNumber
    // divide / randomNumber  // 0으로 나누면 Error가 납니다. 에러처리
    // 랜덤한 숫자가 0으로 생성이 되면 “랜덤하게 생성된 숫자가 0입니다.” 가 출력되게
    private int a;
    private int random;

    public RandomCalculator(int a) {
        this.a = a;
        this.random = (int)(Math.random() * 10);
        System.out.println("a는 " + this.a + ", 랜덤 숫자는 " + this.random);
    }

    public void plus () {
        System.out.println(a + random);
    }
    public void minus () {
        System.out.println(a - random);
    }
    public void multiple () {
        System.out.println(a * random);
    }
    public void divide () {
        if(random == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a / random);
        }
    }
}
