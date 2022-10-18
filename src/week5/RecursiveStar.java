package week5;

public class RecursiveStar {
    public void printARow(int num, String now) {
        if(num == now.length()) {
            System.out.println("재귀가 끝났습니다.");
            return;
        }
        System.out.println("재귀가 실행 중 입니다.");
        printARow(5, now + "*");
    }

    public static void main(String[] args) {
        new RecursiveStar().printARow(5, "");
    }
}
/*
재귀함수: 자기 자신을 호출하는 함수
- Recursive → 재귀(다시 돌아온다)
- 재시작 + 귀환 → 나를 반복 한다
- 끝나는 조건을 '꼭' 넣어주어야 합니다. 안그러면 무한히 실행 됩니다.
- 변화를 주는 구간이 '꼭' 들어가야 합니다.
  탈출 조건을 짜놓고 저 조건까지 갈 수 없다면 역시나 무한히 실행 됩니다.
- 재귀를 쓰는 이유 "재귀를 썼을 때 코드 가독성이 올라가거나 코드 구현이 간단해 지는 경우 씁니다.
 */