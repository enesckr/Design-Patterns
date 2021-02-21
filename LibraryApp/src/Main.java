import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Kitap kitap = new Kitap();
        kitap.adiGir("Seker Portakali");
        kitap.isbnGir(1221245);
        kitap.kitaplikKoduGir("TA-24");
        kitap.materyalTipiGir("kitap");

        IDBMateryal dbm = new MSSQLMateryal();
        dbm.materyalEkle(kitap);
        dbm.materyalSil(kitap);
        dbm.materyalAra("Gulliver'in Gezileri");

        System.out.println("\n ------------- \n");

        EKitap ekitap = new EKitap();
        ekitap.adiGir("Suc ve Ceza");
        ekitap.webAdresiGir("www.ekitapadresi.com/sucveceza.pdf");
        ekitap.materyalTipiGir("e-kitap");

        dbm = new MSSQLMateryal();
        dbm.materyalEkle(ekitap);
        dbm.materyalSil(ekitap);
        dbm.materyalAra("Donusum");

        System.out.println("\n ------------- \n");

        IKullanici kull = new Ogrenci();
        kull.kullaniciBilgiGir("ogrenciMehmet", "Mehmet Turgut", "ogrenci", "1923");

        IDBKullanici msKul = new MSSQLKullanici();

        ArrayList<String> kBilgi = kull.kullaniciBilgiGetir();
        msKul.kullaniciEkle(kBilgi);
        msKul.kullaniciSil(kBilgi);
        msKul.kullaniciAra("Ali Veli");

        System.out.println("\n ------------- \n");

        kull = new Yonetici();
        kull.kullaniciBilgiGir("yoneticiAhmet", "Ahmet Demir", "yonetici", "2345");

        ArrayList<String> kBilgi2 = kull.kullaniciBilgiGetir();
        msKul.kullaniciEkle(kBilgi2);
        msKul.kullaniciSil(kBilgi2);
        msKul.kullaniciAra("Zeynep Deneme");

    }

}
