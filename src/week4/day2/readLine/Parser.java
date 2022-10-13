package week4.day2.readLine;

public interface Parser<T> {
    T parse(String str); // 파일에서 읽어오는 것이라 String
}
