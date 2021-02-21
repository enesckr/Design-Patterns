import java.util.ArrayList;

public class Veritabani {

    private static Veritabani veritabani;
    private ArrayList<Kullanici> kullaniciDb;
    private ArrayList<Urun> urunDb;
    private ArrayList<String> islemDb;
    private static Object _synchronized = new Object();

    private Veritabani() {
        urunDb = new ArrayList<Urun>();
        kullaniciDb = new ArrayList<Kullanici>();
        islemDb = new ArrayList<String>();
    }

    public static Veritabani getInstance() {
        if (veritabani == null) {
            synchronized (_synchronized) {
                if (veritabani == null) {
                    veritabani = new Veritabani();
                }
            }
        }
        return veritabani;
    }

    public ArrayList<Kullanici> getKullaniciDb() {
        return kullaniciDb;
    }

    public ArrayList<Urun> getUrunDb() {
        return urunDb;
    }

    public ArrayList<String> getIslemDb() {
        return islemDb;
    }

    public void urunKaydet(Urun urun) {
        urunDb.add(urun);
        System.out.println(urun.getIsim() + " sisteme kayıt edilmiştir.");
    }

    public void kullaniciKaydet(Kullanici kullanici) {
        kullaniciDb.add(kullanici);
        System.out.println(kullanici.getIsim() + " sisteme kayıt edilmiştir.");
    }

    public void islemKaydet(String log) {
        islemDb.add(log);
    }

}
