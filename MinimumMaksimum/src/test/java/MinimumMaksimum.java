import java.util.Scanner;

public class MinimumMaksimum {
    public static void main(String[] args) {

        int min = 1, max = 1, n, counter, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Gireceğiniz sayı adedi: ");
        counter = scan.nextInt();

        for (i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            n = scan.nextInt();

            if (i == 1) {
                max = n;
                min = n;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }
        System.out.println("Girilen sayılardan en büyüğü: " + max);
        System.out.println("Girilen sayılardan en küçüğü: " + min);
    }
}
