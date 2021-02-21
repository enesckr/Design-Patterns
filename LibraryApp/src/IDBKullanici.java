import java.util.ArrayList;

public interface IDBKullanici {

    void kullaniciEkle(ArrayList<String> kBilgi);

    void kullaniciSil(ArrayList<String> kBilgi);

    void kullaniciAra(String kullaniciAdi);

}
