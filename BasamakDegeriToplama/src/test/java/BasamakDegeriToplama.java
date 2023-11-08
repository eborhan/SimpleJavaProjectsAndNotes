import java.util.Scanner;

public class BasamakDegeriToplama {
    public static void main(String[] args) {
        int n, baseValue, total=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();

        while (n != 0){
            baseValue = n%10;
            total +=baseValue;
            n/= 10;
        }
        System.out.println("Girilen sayının basamakları toplamı: "+total);
    }
}
