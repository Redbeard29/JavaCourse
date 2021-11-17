package chapter7;

import java.util.Arrays;

public class TextProcessor {

    /**
     * Splits a String into an array
     * Counts words and prints them
     * @param myString Full string to be split
     */
    public static void countWords(String myString){
        var words = myString.split(" ");
        int wordCount = words.length;
        String message = String.format("Your text contains %d words:", wordCount);
        System.out.println(message);
        for(String word : words){
            System.out.println(word);
        }
    }

    /**
     * Prints a String in reverse order
     * @param myString String to reverse
     */
    public static void reverseString(String myString){
        for(int x = myString.length() - 1; x >= 0; x--){
            System.out.print(myString.charAt(x));
        }
        System.out.println();
    }

    /**
     * Adds spaces before each capital letter
     * @param myString string with no spaces
     */
    public static void addSpaces(String myString){
        var modifiedString = new StringBuilder(myString);

        for(int x = 1; x < modifiedString.length(); x++){
            if(Character.isUpperCase(modifiedString.charAt(x))){
                modifiedString.insert(x, " ");
                x++;
            }
        }

        System.out.println(modifiedString);
    }

    public static void main(String[] args){
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMe,Ben");
        String avacado = "avacado";
        System.out.println(Arrays.toString(avacado.split("a")));
    }

}
