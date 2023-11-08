import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();
        if (isPalindrome(n))
            System.out.println(n + " bir palindrom sayıdır.");
        else
            System.out.println(n + " bir palindrom sayı değildir.");

    }
}
