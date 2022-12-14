package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){

        double planFee = getPlanFee();
        double overageMinutes = getOverageMinute();
        scanner.close();
        double overageFee = calculateOverageFee(overageMinutes);
        double subtotal = calculateSubtotal(planFee, overageFee);
        double taxSubtotal = calculateTaxSubtotal(subtotal);
        double finalTotal = calculateFinalTotal(subtotal, taxSubtotal);
        printOut(planFee, overageFee, taxSubtotal, finalTotal);
    }
    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }
    public static double getOverageMinute(){
        System.out.println("Enter overage minutes: ");
        return scanner.nextDouble();
    }
    public static double calculateOverageFee(double overageMinutes){
        double costPerMinute = 0.25;
        return overageMinutes * costPerMinute;
    }
    public static double calculateSubtotal(double planFee, double overageFee){
        return planFee + overageFee;
    }
    public static double calculateTaxSubtotal(double subtotal){
        int tax = 15;
        return (subtotal * tax) / 100;
    }
    public static double calculateFinalTotal(double subtotal, double taxSubtotal){
        return subtotal + taxSubtotal;
    }
    public static void printOut(double planFee, double overageFee, double taxSubtotal, double finalTotal){
        System.out.println("Phone Bill Statement\nPlan: " + planFee + "\nOverage: " + overageFee + "\nTax: " + taxSubtotal + "\nTotal: " + finalTotal);

    }
}
