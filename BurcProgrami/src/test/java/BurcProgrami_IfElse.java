import java.util.Scanner;

public class BurcProgrami_IfElse {
    public static void main(String[] args) {

        int day, month;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayınızı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğum gününüzü giriniz: ");
        day = input.nextInt();


            if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                burc = "Kova";
            } else if ((month == 2) || (month == 3 && day <= 20)) {
                burc = "Balık";
            } else if ((month == 3) || (month == 4 && day <= 20)) {
                burc = "Koç";
            } else if ((month == 4) || (month == 5 && day <= 21)) {
                burc = "Boğa";
            } else if ((month == 5) || (month == 6 && day <= 22)) {
                burc = "İkizler";
            } else if ((month == 6) || (month == 7 && day <= 22)) {
                burc = "Yengeç";
            } else if ((month == 7) || (month == 8 && day <= 22)) {
                burc = "Aslan";
            } else if ((month == 8) || (month == 9 && day <= 22)) {
                burc = "Başak";
            } else if ((month == 9) || (month == 10 && day <= 22)) {
                burc = "Terazi";
            } else if ((month == 10) || (month == 11 && day <= 21)) {
                burc = "Akrep";
            } else if ((month == 11) || (month == 12 && day <= 21)) {
                burc = "Yay";
            } else if ((month == 12) || (month == 1 && day <= 21)){
                burc = "Oğlak";
            }else{
                System.out.println("Hatalı giriş yaptınız");
        }

        System.out.println("Burcunuz: " + burc);
    }

}

