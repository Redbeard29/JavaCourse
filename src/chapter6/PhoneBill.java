package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 100.00;
        allottedMinutes = 1000;
        minutesUsed = 1000;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 100.00;
        allottedMinutes = 1000;
        minutesUsed = 1000;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.35;
        double overageMins = minutesUsed - allottedMinutes;
        return overageMins * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.08;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBill(){
        System.out.println("ID: " + id);
        System.out.println("Base cost: $" + baseCost);
        System.out.println("Overage Fees: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total Cost: $" + String.format("%.2f", calculateTotal()));
    }

}
