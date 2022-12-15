package chapter6;

public class PhoneBillMain {
        public static void main(String args[]){
            PhoneBill bill = new PhoneBill();
            bill.setId(23456);
            bill.setBaseCost(40);
            bill.setAllottedMinutes(85);
            bill.setMinutesUsed(90);
            bill.printItemizedBill();
        }
    }

