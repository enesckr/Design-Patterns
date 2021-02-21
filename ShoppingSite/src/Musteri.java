import java.util.ArrayList;

public class Musteri extends Kullanici implements ISepet {

    private String isim;
    private String mail;
    private String sifre;
    private String adres;
    private ArrayList<Urun> sepet;
    private Veritabani veritabani;

    public Musteri(String isim, String mail, String sifre, String adres) {
        this.isim = isim;
        this.mail = mail;
        this.sifre = sifre;
        this.adres = adres;
        veritabani = Veritabani.getInstance();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.getIsim() + " - " + urun.getFiyat());
    }

    @Override
    public void urunEkle(Urun urun) {
        if (sepet == null) {
            sepet = new ArrayList<Urun>();
        }
        if (veritabani.getUrunDb().contains(urun))
            sepet.add(urun);
        else
            System.out.println(urun.getIsim() + " sistemde bulunmamaktadır.");
    }

    @Override
    public void urunCikar(Urun urun) {
        if (sepet.contains(urun)) {
            sepet.remove(urun);
        } else {
            System.out.println("Sepetinizde " + urun.getIsim() + " bulunmamaktadır.");
        }
    }

    @Override
    public void odemeYap() {
        float sum = 0.0F;
        for (Urun urun : sepet) {
            sum += urun.getFiyat();
        }
        System.out.println(this.getIsim() + " " + sum + " tutarında ödeme yaptı.");
        String log = this.getIsim() + " " + sum + " " + sepet.toString();
        veritabani.islemKaydet(log);
        System.out.println(this.getIsim() + " " + sum + " ödemesi sisteme kayıt edilmiştir.");
    }

}