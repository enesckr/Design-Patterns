import java.util.ArrayList;

public class Ogrenci implements IKullanici {

    private String kullaniciAdi;
    private String adSoyad;
    private String no;
    private String kullaniciTuru;

    @Override
    public ArrayList<String> kullaniciBilgiGetir() {
        ArrayList<String> kullaniciDb = new ArrayList<>();
        kullaniciDb.add(this.getKullaniciAdi());
        kullaniciDb.add(this.getAdSoyad());
        kullaniciDb.add(this.getKullaniciTuru());
        kullaniciDb.add(this.getNo());
        return kullaniciDb;
    }

    @Override
    public void kullaniciBilgiGir(String kullaniciAdi, String adSoyad, String kullaniciTuru, String no) {
        this.kullaniciAdi = kullaniciAdi;
        this.adSoyad = adSoyad;
        this.kullaniciTuru = kullaniciTuru;
        this.no = no;
    }


    @Override
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    @Override
    public String getAdSoyad() {
        return adSoyad;
    }

    @Override
    public String getNo() {
        return no;
    }

    @Override
    public String getKullaniciTuru() {
        return kullaniciTuru;
    }

}
