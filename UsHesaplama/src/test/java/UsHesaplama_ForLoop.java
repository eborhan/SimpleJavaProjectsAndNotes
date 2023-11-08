import java.util.Scanner;

public class UsHesaplama_ForLoop {
    public static void main(String[] args) {

        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        System.out.println("Girilen sayıya kadar 4'ün ve 5'in kuvveti olan sayılar: ");
        for (i = 1; i <= n; i*=4) {
            System.out.println("4'ün kuvveti: " + i);
            }
        for (i = 1; i <= n; i*=5) {
            System.out.println("5'in kuvveti: " +"----"+ i);
    }

    }

}
