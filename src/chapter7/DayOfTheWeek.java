package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        DayOfTheWeek conversion = new DayOfTheWeek();
        String[] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };
        int dayNumber = conversion.inputUser();
        conversion.outputString(days, dayNumber);
    }
    public int inputUser(){
        System.out.println("Input a number corresponding to some day of the week (1-7): ");
        return scanner.nextInt();
    }
    public void outputString(String[] days, int dayNumber){
        System.out.println(days[dayNumber-1]);
    }
}
