import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        //Meyve ve sebzelerin birim fiyatlarını giriyoruz.
        double aKg = 2.14, dKg=3.67, eKg=1.11, mKg=0.95, pKg=5.00, aMiktar, dMiktar, eMiktar, mMiktar, pMiktar, toplam;

        //Kullanıcıdan girdi alma zamanı...
        Scanner input = new Scanner(System.in);

        System.out.print("Armut miktarını giriniz: ");
        aMiktar = input.nextDouble();
        System.out.print("Domates miktarını giriniz: ");
        dMiktar = input.nextDouble();
        System.out.print("Elma miktarını giriniz: ");
        eMiktar = input.nextDouble();
        System.out.print("Muz miktarını giriniz: ");
        mMiktar = input.nextDouble();
        System.out.print("Patlıcan miktarını giriniz: ");
        pMiktar = input.nextDouble();

        //Ödenecek toplam parayı birim fiyat ve girilen miktar çarpımı üzerinden hesaplıyoruz.

        toplam = (aKg*aMiktar)+(dKg*dMiktar)+(eKg*eMiktar)+(mKg*mMiktar)+(pKg*pMiktar);

        System.out.print("Ödeyeceğiniz toplam para: "+toplam+"TL");

    }

}
