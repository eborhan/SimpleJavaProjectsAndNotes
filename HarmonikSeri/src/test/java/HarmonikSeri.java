import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int n;
        double result = 0.0, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            result += 1 / i;
        }
        System.out.print("Girilen sayıya kadar harmonik seri: " + result);

    }
}
