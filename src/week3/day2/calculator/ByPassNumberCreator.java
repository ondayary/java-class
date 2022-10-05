package week3.day2.calculator;

public class ByPassNumberCreator implements NumberCreator{
    @Override // alt + Enter
    public int create(int num) {
        return num;
    }
}
