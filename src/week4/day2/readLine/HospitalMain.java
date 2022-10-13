package week4.day2.readLine;

import java.io.IOException;
import java.util.List;

public class HospitalMain {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "/Users/daon/Downloads/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        for(Hospital hospital : hospitals) {
            System.out.println(hospital.getId()); // 전체 id뽑기
        }
    }
}
