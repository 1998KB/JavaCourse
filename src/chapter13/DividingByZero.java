package chapter13;

public class DividingByZero {

    public static void main(String[] arg) {
        try{
            int c = 30 / 0;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Dividing by zero is not allowed");
        }finally {
            System.out.println("Division is fun!");
        }

    }
}
