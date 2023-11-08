import java.util.Scanner;

public class BolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int number, i, sum = 0, counter = 0, average = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
            }
        }
        System.out.println("0'dan " + number + "'a/e kadar 3 ve 4'e tam bölünebilen sayıların toplamı: " + sum);
        average = sum / counter;
        System.out.println("Bu sayıların ortalaması: " + average);
    }
}