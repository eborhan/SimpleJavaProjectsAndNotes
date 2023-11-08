import java.util.Scanner;

public class UsHesaplama3 {

    public static int pow(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        }
        int result = pow(a, b - 1) * a;
        System.out.println(result);
        return result;


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Taban değerini giriniz :");
        a = scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        b = scan.nextInt();
        int result = pow(a, b);
        System.out.println("Girilen sayıların üs sonucu: " + result);

    }
}

