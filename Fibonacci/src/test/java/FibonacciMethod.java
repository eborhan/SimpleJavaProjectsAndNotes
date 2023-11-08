import java.util.Scanner;
public class FibonacciMethod {
    static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;

        }return f(n - 1) + f(n - 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();
        System.out.print("Girilen sayıya ait Fibonacci serisi: "+f(n));
    }
}
