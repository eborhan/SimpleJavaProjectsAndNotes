
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {

        int a,b,c,u;
        double alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextInt();
        System.out.print("3. kenarı giriniz: ");
        c = input.nextInt();

        u = (a+b+c)/2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.print("Üçgenin alanı: "+alan);



    }
}
