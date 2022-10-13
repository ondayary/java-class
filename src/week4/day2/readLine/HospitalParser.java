package week4.day2.readLine;

public class HospitalParser implements Parser<Hospital>{

    @Override
    public Hospital parse(String str) {
        String[] splitted  = str.split(",");
        return new Hospital(splitted[0]);
    }
}
