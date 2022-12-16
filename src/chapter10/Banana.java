package chapter10;

public class Banana extends Fruit{

    public void peel(){
        System.out.println("Peel!");
    }

    public Banana(int calories){
        super(calories);
    }

    @Override
    public void MakeJuice(){
        System.out.println("Banana juice is made. It contains " + calories + " calories.");
    }
}
