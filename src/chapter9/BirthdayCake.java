package chapter9;

public class BirthdayCake extends Cake{

    public int Candles;

    public BirthdayCake(){
        super("vanilla");
    }
    public int getCandles() {
        return Candles;
    }
    public void setCandles(int candles) {
        Candles = candles;
    }


}
