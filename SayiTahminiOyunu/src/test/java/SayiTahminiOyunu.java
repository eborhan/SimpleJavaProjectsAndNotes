import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminiOyunu {
    public static void main(String[] args) {

        Random rand = new Random();
        int expectedNumber = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int attempt = 0;
        boolean isWin = false;
        boolean isError = false;
        int[] predictions = new int[5];

        while (attempt < 5) {
            System.out.print("Please, enter your prediction: ");
            int actualNumber = scan.nextInt();
            if (actualNumber < 0 || actualNumber > 100) {
                System.out.println("Please, enter a number between 0-100");
                if (!isError) {
                    isError = true;
                    System.out.println("One more erroneous input will be penalized!");
                } else {
                    System.out.println("Too many erroneous inputs! Remaining attempts: " + (5 - (++attempt)));
                }
                continue;
            }
            if (actualNumber == expectedNumber) {
                System.out.println("Congratulations! You hit the number: " + expectedNumber);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong prediction!");
                if (actualNumber > expectedNumber) {
                    System.out.println(actualNumber + " is greater than the expected number");
                } else {
                    System.out.println(actualNumber + " is lower than the expected number");
                }
                predictions[attempt++] = actualNumber;
                System.out.println("Remaining attempts: " + (5 - attempt));
            }
        }
        if (!isWin) {
            System.out.println("You lose!");
            System.out.println("Your predictions" + Arrays.toString(predictions));
        }


    }


}
