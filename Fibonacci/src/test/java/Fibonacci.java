import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n, n1 = 0, n2 = 1, n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
