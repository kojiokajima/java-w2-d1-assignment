import java.util.Scanner;
import java.lang.Math;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char userInput = input.next().charAt(0);

        if(Character.isLetter(userInput)) {
            switch(userInput) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.println(userInput + " is a vowel");
                    break;
                default:
                System.out.println(userInput + " is a consonant");
            }
        } else {
            System.out.println(userInput + " is an invalid input");
        }
    }
}