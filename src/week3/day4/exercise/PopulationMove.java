package week3.day4.exercise;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // String 타입으로 오버로딩
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public PopulationMove parse(String data){
        String[] sidoData = data.split("\\,");
        return new PopulationMove(sidoData[6], sidoData[0]); // 리턴타입을 맞춰줌
    }
}
