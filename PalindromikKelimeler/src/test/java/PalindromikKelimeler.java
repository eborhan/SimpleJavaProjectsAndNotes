import java.util.Scanner;

public class PalindromikKelimeler {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to check if it is palindrome: ");
        String word = scan.nextLine();

        System.out.println("Is the word palindrome? ---> " + isPalindrome(word));
        System.out.println("Is the word palindrome? ---> " + isPalindrome2(word));


    }
}
