import java.util.ArrayList;

public class MSSQLKullanici implements IDBKullanici {

    @Override
    public void kullaniciEkle(ArrayList<String> kBilgi) {
        System.out.println(kBilgi.get(1) + " isimli kullanici veritabanina eklendi.");
    }

    @Override
    public void kullaniciSil(ArrayList<String> kBilgi) {
        System.out.println(kBilgi.get(0) + " isimli kullanici veritabanindan silindi.");
    }

    @Override
    public void kullaniciAra(String kullaniciAdi) {
        System.out.println(kullaniciAdi + " isimli kullanici veritabaninda araniyor ...");
    }

}
