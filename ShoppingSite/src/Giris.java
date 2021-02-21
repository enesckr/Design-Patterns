import java.util.Objects;

public class Giris {

    private Veritabani veritabani;

    public Giris() {
        veritabani = Veritabani.getInstance();
    }

    public boolean girisKontrol(String mail, String sifre) {

        for (Kullanici kullanici : veritabani.getKullaniciDb()) {
            if (Objects.equals(kullanici.getMail(), mail) && Objects.equals(kullanici.getSifre(), sifre)) {
                return true;
            }
        }
        return false;
    }

}
