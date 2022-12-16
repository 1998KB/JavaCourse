package chapter10;

public class Apple extends Fruit{

    public void removeSeeds(){
        System.out.println("Remove seeds!");
    }

    public Apple(int calories){
        super(calories);
    }

    @Override
    public void MakeJuice(){
        System.out.println("Apple juice is made. It contains " + calories + " calories");
    }
}
