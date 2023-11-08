import java.util.*;

public class Password {
    public static void main(String[] args) {

        /* Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
                    duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
                    basariyla kaydedildi" yazdirin
                    - ilk harf kucuk harf olmali
                    - son karakter rakam olmali
                    - sifre bosluk icermemeli
                    - uzunlugu en az 10 karakter olmali */


        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please, set your password: ");
            String password = scan.nextLine();

            if (Character.isUpperCase(password.charAt(0))) {
                System.out.println("The first character of your password should be lower case!");

            } else if (!(Character.isDigit(password.charAt(password.length() - 1)))) {
                System.out.println("The last character of your password should contain a number!");

            } else if (password.contains(" ")) {
                System.out.println("Your password cannot contain a space!");

            } else if (password.length() < 10) {
                System.out.println("Your password cannot be shorter than 10 characters!");

            } else {
                System.out.println("You successfully set your password!");
                break;
            }

        } while (true);

    }
}