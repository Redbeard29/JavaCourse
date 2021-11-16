package chapter7;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int x = 0; x < ticket.length; x++){
            ticket[x] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int x = 0; x < ticket.length; x++){
            System.out.print(ticket[x] + " | ");
        }
    }

    public static void main(String[] args){
        int [] ticket = generateNumbers();
        printTicket(ticket);
    }

}
