import java.util.Scanner;

public class AsalSayi2 {
    static int prime(int a, int b) {
        if (a == b) {
            System.out.print(a + " bir asal sayıdır.");
            return 0;
        } else if (a % b == 0) {
            System.out.print(a + " bir asal sayı değildir.");
            return 1;

        }
        return prime(a, b + 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        prime(n, 2);

    }
}