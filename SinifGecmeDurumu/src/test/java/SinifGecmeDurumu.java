import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, courseNumber = 0;
        double totalScore = 0, average;

        System.out.println("Lütfen notunuzu 0 ila 100 arasında bir değer olarak girdiğinizden emin olun.");

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        //0 ila 100 dışında girilen notların ortalamaya katılmaması için kullanılan bloklar


        if (!(mat <= 0 || mat > 100)) {
            courseNumber++;
            totalScore += mat;
        }
        if (!(fizik <= 0 || fizik > 100)) {
            courseNumber++;
            totalScore += fizik;
        }
        if (!(turkce <= 0 || turkce > 100)) {
            courseNumber++;
            totalScore += turkce;
        }
        if (!(kimya <= 0 || kimya > 100)) {
            courseNumber++;
            totalScore += kimya;
        }
        if (!(muzik <= 0 || muzik > 100)) {
            courseNumber++;
            totalScore += muzik;

        }

        //Ortalamaya göre sınıf geçme durumunu gösteren bloklar

        average = totalScore / courseNumber;

        if (average <= 55) {
            System.out.println("Sınıfı geçemediniz.");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

        System.out.print("Not ortalamanız: " + average);

    }
}