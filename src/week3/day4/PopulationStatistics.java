package week3.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PopulationStatistics {

    // Session 3
    // 기존에 쓰던 코드 void 메소드로 분리
    public void readByChar (String filename) throws IOException {
        FileReader fileReader = new FileReader(filename); // location : 파일 위치
        // 여기까지는 파일을 읽지 않는다.

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            // 100만 글자 읽을 때까지
            System.out.println(fileContents);
        }
        // 1줄씩 읽는 기능
        System.out.println(fileContents);
    }

    // 4 -> 5 과정 사이 PopulationMove 클래스 생성
    // Session 5
    // parse 메소드 구현하기

    // Session 6
    // PopulationMove Constructor 오버로딩

    // Session 7
    public List<PopulationMove> readByLine(String filename) throws IOException {
        // 삽
        List<PopulationMove> pml = new ArrayList<>(); // List 만듬
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)); // 파일을 읽을 수 있는 객체

        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }
    // while문 안에서 string을 PopulationMove로 parsing하여 pml에 add
    // 루프가 끝나면(파일을 모두 읽어서 파싱을 끝냈으면) return

    public void readAllLines(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm : pms) {
            System.out.println(pm.getFromSido());
        }
    }

    // Session 4
    // fvoid readByLine2
    public void readByLine2(String filename) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        //String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528\n";
        // csv
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);// from, to
        // txt 파일에 업데이트 하고 나면 return new PopulationMove(sidoData[6], sidoData[0]);
    }

    // Session 9
    // 파일로 생성하기
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile(); // file 객체안에 파일을 생성하는 메소드
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    public void createAFile() throws IOException {
        File file = new File("from_to.txt");
        file.createAFile(); // 이것을 써줘야 파일이 생성됨
        System.out.println("파일 생성 여부 : " + file.exists());
    }
    */

    // Session 10
    // 파일 만들어졌고 내용을 써주는 메소드
    // List<String>을 지정한 파일에 write(저장)하는 메소드
    public void write(List<String> strs, String filename) {
        // 파일내려짐 받은 파일안에 strs를 넣겠다.
        // filename을 가지고 file을 만든다.
        File file = new File(filename);

        // 한줄씩 입력한다.
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // 어떤 파일을 쓸건지 매개변수로 받는다.
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Session 11
    // PopulationMove => “11,11” // from, to
    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public Set<Integer> printSidoCd(List<PopulationMove> populationMoveList) {

        Set<Integer> intSet = new HashSet<>();
        for (PopulationMove pm : populationMoveList) {
            intSet.add(pm.getToSido());
            intSet.add(pm.getFromSido());
        }
        System.out.println(intSet);
        return intSet;
    }

    // 키 만들기
    // map에 키에 해당하는 밸류 없으면 1 대입
    // map에 키에 해당하는 밸류 있으면 +1
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);
        return map;
    }

    // Session 1
    // 파일 읽어오기
    public static void main(String[]args) throws IOException {
        // String address = "/Users/daon/Downloads/2021_인구관련연간자료_20220927_66125.csv";

        // Session 8
        String address = "./from_to.txt";
        // 이렇게 받은 파일에 [0], [1]을 받는다.
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address); // 정보를 떼올 리스트

        // Session 13
        for(PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        // String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";


        // Session 12
        // ./from_to.txt에 저장하기
        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido()); // 가공할 단계
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

        // Session 13
        // 시도 코드는 총 몇 개가 사용 되었을까요?
        // Set을 이용해 사용된 시도코드를 1개씩만 뽑아보기
        Set<Integer> sidoCodes = new HashSet<>();
        for(PopulationMove pm : pml) {
            sidoCodes.add(pm.getFromSido());
            sidoCodes.add(pm.getToSido());
        }
        System.out.println(sidoCodes);

        populationStatistics.write(strings, "./from_to.txt");

    }
}

