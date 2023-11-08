import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, select, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Hoşgeldiniz");

        } else if (userName != "patika" && password.equals("java123")) {
            System.out.println("Kullanıcı adı yanlış");

        } else if (userName.equals("patika") && password != "java123") {
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            select = input.nextLine();

            if (select.equals("Hayır")) {
                System.out.println("Görüşmek üzere!");
            } else if (select.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen başka bir şifre deneyiniz");
                } else
                    System.out.println("Yeni şifre başarıyla belirlendi");
                password = newPassword;

            } else
                System.out.println("Hatalı giriş");
        } else
            System.out.println("Kullanıcı adı ve şifre hatalı. Lütfen tekar deneyin");

    }

}
