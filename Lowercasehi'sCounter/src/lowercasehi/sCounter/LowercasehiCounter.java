package lowercasehi.sCounter;

import java.util.Scanner;

public class LowercasehiCounter {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String wordempty = " ";
        System.out.println("Please enter a word and I will tell you how many times a lowercase hi apppears: ");
        String word = input.nextLine();
        int toggle = 0;

        int index = word.indexOf("hi");

        while (index != -1) {
            toggle++;
            word = word.substring(index + 1);
            index = word.indexOf("hi");
        }
        System.out.println("The amount of times the word 'hi' appears, and is lowercase is " + toggle);
    }
    
}

