package week3.day3.readFile;

import java.io.File;
import java.io.IOException;

public class ReadFileList {
    // .listFiles : 파일들이 배열에 담김
    // ./ : 가장 상단에 있는 프로젝트 디렉토리를 지징
    // FileReader : 파일 읽어들이는 것
    // throws 하는 이유 : 파일이 없으면 FileNotFoundException 발생
    public static void main(String[] args) throws IOException {
        // 현재 디렉토리 목록 출력
        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]); // h

        for(File file : files) {
            System.out.println(file);
        }
    }
}

    /*
    ./.DS_Store
    ./.DS_Store
    ./out
    ./java-class.iml
    ./.gitignore
    ./.git
    ./a_file.txt
    ./.idea
    ./src
     */
