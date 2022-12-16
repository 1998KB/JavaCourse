package chapter10;

public class Market {

    public static void main(String[] args){

        Fruit apple = new Apple(100);
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple(111);
        apple2.removeSeeds();

        Banana banana = new Banana(223);
        banana.peel();

        Fruit banana2 = new Banana(299);
        ((Banana) banana2).peel();

        Fruit orange = new Fruit(80);

        squeeze(apple);
        squeeze(apple2);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);
    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.MakeJuice();
    }
}

