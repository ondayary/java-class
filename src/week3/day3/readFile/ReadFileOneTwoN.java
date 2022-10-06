package week3.day3.readFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileOneTwoN {
    // 맨 앞 한 글자를 읽어오는 method
    static void ReadFileOne(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        char ch = (char) fr.read();
        System.out.println(ch);
    }

    // 맨 앞 두 글자를 읽어오는 method
    static void ReadFileTwo(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        for (int i = 0; i < 2; i++) {
            char ch = (char) fr.read();
            System.out.print(ch);
        }
        System.out.println();
    }

    // 맨 앞 n 글자를 읽어오는 method
    static void ReadFileN(String fileName, int num) throws IOException {
        FileReader fr = new FileReader(fileName);
        for (int i = 0; i < num; i++) {
            char ch = (char) fr.read();
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        ReadFileOne("a_file.txt");
        ReadFileTwo("a_file.txt");
        ReadFileN("a_file.txt", 5);
    }
}

