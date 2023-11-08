import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2, i = 1, ebob = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = scan.nextInt();


        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Girilen sayıların EKOK'u: " + i);
                break;
            } else {
                i++;
            }
        }
        System.out.println("----------");

        i = 1;
        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.print("Girilen sayıların EBOB'u: " + ebob);

    }

}