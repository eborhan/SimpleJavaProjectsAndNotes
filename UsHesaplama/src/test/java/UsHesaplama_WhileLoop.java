import java.util.Scanner;

public class UsHesaplama_WhileLoop {
    public static void main(String[] args) {

        int n, i = 1, j = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        n = input.nextInt();

        System.out.println("Girilen sayıya kadar 4'ün ve 5'in kuvveti olan sayılar: ");

        while (i <= n) {
            System.out.println("4'ün kuvveti: " + i);
            i *= 4;
            if (j <= n) {
                System.out.println("5'in kuvveti: " +"----"+ j);
                i *= 5;
            }
        }
    }
}