import java.util.Scanner;

public class BirTikGelismisHesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int substract(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölünmez");
            return 0;
        } else {
            int result = a / b;
            System.out.println("Bölme: " + result);
            return result;

        }
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        return result;
    }

    static void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        System.out.println("Girilen ilk sayının faktöryeli : " + result);

    }

    static int mode(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        System.out.println("Dikdörtgen çevresi: " + (2 * (a + b)));
        System.out.println("Dikdörtgen alanı: " + (a * b));
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select, a, b;


        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Sayının Üssünü Alma\n"
                + "6 - Faktöryel Hesaplama\n"
                + "7 - Mod Alma\n"
                + "8 - Dikdörtgen Alan ve Çevre Hesapmala\n"
                + "0 - Çıkış";


        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("İlk sayıyı giriniz: ");
            a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    substract(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    System.out.println("üslü sayı: " + power(a, b));
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    System.out.println("Mod işlemi: " + mode(a, b));
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem");


            }


        }
        System.out.print("Güle güle.");

    }
}
