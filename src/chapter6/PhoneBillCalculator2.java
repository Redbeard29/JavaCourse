package chapter6;

public class PhoneBillCalculator2 {

    public static void main(String args[]){
        PhoneBill myBill = new PhoneBill(15708234);
        myBill.setMinutesUsed(1200);
        myBill.printBill();

    }

}
