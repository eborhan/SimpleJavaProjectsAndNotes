import java.util.Scanner;

public class CiftSayiToplama {
    public static void main(String[] args) {

        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
        ekrana basan programı yazıyoruz.
         */

        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir çift sayı giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0) { // Ödev içinde 4'ün katı da belirtiliyor fakat mode 2 her zaman mode 4'ü kapsar.
                sum += n;
            }
        } while (n % 2 == 0);
        System.out.println("Hatalı değer. Program sonlandırılıyor...");

        System.out.println("Şu ana kadar girilen çift sayıların toplamı: " + sum);
    }
}
