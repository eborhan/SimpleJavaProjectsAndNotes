import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, kmUcret=2.20, acilis = 10.0, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km oldu: ");
        km = input.nextDouble();

        tutar = km*kmUcret + acilis;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.print("Ödenecek tutar: "+tutar+"TL");


    }
}
