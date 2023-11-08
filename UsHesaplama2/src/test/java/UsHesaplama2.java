import java.util.Scanner;
public class UsHesaplama2 {
    public static void main(String[] args) {

        int n,k,i,powerN=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scan.nextInt();
        System.out.print("Üssü giriniz: ");
        k = scan.nextInt();

        for (i = 1; i <= k; i++){
            powerN *= n;
        }
        System.out.print(n + "'nin "+k+"nci kuvveti: " +powerN);

    }
}