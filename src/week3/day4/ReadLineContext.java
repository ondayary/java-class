package week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;

    public void readByLine(String filename) throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(filename));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            // PopulationMove pm = parse(str);
        }
        reader.close();
    }
}
