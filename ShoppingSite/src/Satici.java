public class Satici extends Kullanici{

    private String isim;
    private String mail;
    private String sifre;
    private String adres;
    private Veritabani veritabani;

    public Satici(String isim, String mail, String sifre, String adres) {
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
        System.out.println(urun.getIsim() + " - " + urun.getFiyat() + " , " + urun.getSatici().getIsim() + " - " + urun.getSatici().getAdres());
    }

    public void kaydet(Urun urun) {
        veritabani.urunKaydet(urun);
    }

}
