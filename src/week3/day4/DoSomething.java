package week3.day4;

import java.util.List;
// List<T>를 리턴하는 인터페이스 설계
public interface DoSomething<T> {
    List<T> work(String str);
}

/*
List<T> 를 리턴하는 인터페이스를 설계한다.
T 는 구현체에서 바꿀 수 있기 때문이다.
T 가 PopulationMove 가 될 수도 있고
T 가 Patient 가 될 수도 있고
T 가 Student 가 될 수도 있다.
 */
