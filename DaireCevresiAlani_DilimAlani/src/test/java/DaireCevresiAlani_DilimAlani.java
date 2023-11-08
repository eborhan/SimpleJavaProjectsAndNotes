import java.util.Scanner;
public class DaireCevresiAlani_DilimAlani {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, daireCevre, daireAlan, dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        a = input.nextInt();

        daireCevre = 2*pi*r;
        daireAlan = pi*r*r;
        dilimAlan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin çevresi: "+daireCevre);
        System.out.println("Dairenin alanı: "+daireAlan);
        System.out.println("Dilim alanı: "+dilimAlan);



    }
}
