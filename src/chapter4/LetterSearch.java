package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]){
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for(int x=0; !letterFound && x<text.length(); x++){
            char currentLetter = text.charAt(x);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }

}
