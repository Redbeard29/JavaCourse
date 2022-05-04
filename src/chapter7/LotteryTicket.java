package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int x = 0; x < ticket.length; x++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));

            ticket[x] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] ticket, int generatedNum){
        /**
         * Does a sequential search on the array to find a value
         * @param array Array to search through
         * @param generatedNum number that we created that we will check to see if already exists
         * @return true if found, false if not
         */
        for(int number : ticket){
            if (number == generatedNum){
                return true;
            }
        }
        return false;
    };


    public static void printTicket(int ticket[]){
        for(int x = 0; x < ticket.length; x++){
            System.out.print(ticket[x] + " | ");
        }
    }

    public static void main(String[] args){
        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

}
