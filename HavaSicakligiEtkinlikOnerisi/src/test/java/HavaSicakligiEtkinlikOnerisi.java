import java.util.Scanner;

public class HavaSicakligiEtkinlikOnerisi {
    public static void main(String[] args) {

        int temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava kaç derece: ");
        temp = input.nextInt();

        if (temp <= -20 || temp >= 50) {
            System.out.println("Dışarı çıkman pek hayra alamet değil!");
        } else if (temp < 5) {
            System.out.println("Kayak iyi gider!");
        } else if (temp >= 5 && temp < 15) {
            System.out.println("Sinemada güzel bir fil olabilir!");
        } else if (temp >= 15 && temp < 25) {
            System.out.println("Mangal havası!");
        } else {
            System.out.println("İyi yüzülür bu havada!");
        }


    }

}
