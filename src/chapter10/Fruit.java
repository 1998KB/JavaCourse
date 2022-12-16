package chapter10;

public class Fruit {

    protected int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public void MakeJuice(){
        System.out.println("juice is made. It contains " + calories + " calories.");
    }

}
