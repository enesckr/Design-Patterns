import java.util.ArrayList;

public interface IKullanici {

    ArrayList<String> kullaniciBilgiGetir();

    void kullaniciBilgiGir(String kullaniciAdi, String adSoyad, String kullaniciTipi, String no);

    String getKullaniciAdi();

    String getAdSoyad();

    String getNo();

    String getKullaniciTuru();

}
