import java.util.Scanner;

public class Desen {
    static void desen(int a) {
        System.out.print(a + " ");
        if (a > 0) {
            desen(a - 5);
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        desen(n);

    }
}
