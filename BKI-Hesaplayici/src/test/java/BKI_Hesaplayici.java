import java.util.Scanner;
public class BKI_Hesaplayici {
    public static void main(String[] args) {

        double height, weight, BMI;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        weight = input.nextDouble();

        BMI = weight/(height*height);

        System.out.print("Vücut Kitle İndeksiniz: "+ BMI);

    }
}
