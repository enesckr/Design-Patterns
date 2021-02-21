public class Urun {

    private Satici satici;
    private String isim;
    private double fiyat;

    public Urun(Satici satici, String isim, double fiyat) {
        this.satici = satici;
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public Satici getSatici() {
        return satici;
    }

    public void setSatici(Satici satici) {
        this.satici = satici;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

}
