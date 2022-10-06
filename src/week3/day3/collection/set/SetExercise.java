package week3.day3.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    // Set : 중복을 허용하지 않은 List
    // 랜덤으로 숫자 0부터 100까지 넣을 때 set 이용
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // tree set
        set1.add("아메리카노");
        set1.add("카페라떼");
        set1.add("바닐라라떼");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1); // 중복을 허용하지 않아 추가 안됨
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);
    }
}
