import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int i, N, r, totalN = 1, totalR = 1, totalNr = 1, komb;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Küme kaç elemanlı?: ");
            N = scan.nextInt();
            System.out.print(N + " elamanlı kümeden oluşturulacak grup kaç elemanlı?: ");
            r = scan.nextInt();
            if (N > r) {

                for (i = 1; i <= N; i++) {
                    totalN *= i;
                }
                for (i = 1; i <= r; i++) {
                    totalR *= i;
                }
                for (i = 1; i <= N - r; i++) {
                    totalNr *= i;
                }
                komb = totalN / (totalR * (totalNr));
                System.out.println(N + "'in " + r + "'li kombinasyonu: " + komb);
                break;

            } else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }

    }
}
