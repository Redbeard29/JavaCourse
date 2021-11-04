package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]){

        Random random = new Random();

        int lastSpace = 20;
        int currentSpace = 0;
        int rollsRemaining = 5;

        do{

            int die = random.nextInt(6) + 1;
            rollsRemaining --;
            currentSpace += die;
            if(currentSpace == lastSpace){
                System.out.println("You've rolled a " + die + ". You are now on space " + currentSpace + ". You win!");
                break;
            }
            else if(currentSpace > 20){
                System.out.println("You've rolled a " + die + ". You overshot the final space. You lose!");
            }
            else{
                int spacesRemaining = lastSpace - currentSpace;
                System.out.println("You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + spacesRemaining + " spaces left.");
                System.out.println("Rolls remaining: " + rollsRemaining + "\n");
            }

        }while(rollsRemaining > 0 && currentSpace <= lastSpace);

        if(rollsRemaining == 0 && currentSpace < lastSpace){
            System.out.println("You've run out of rolls. You lose!");
        }

    }

}
