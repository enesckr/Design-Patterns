public class Kitap implements IMateryal {

    private String materyalAdi;
    private int isbn;
    private String kitaplikKodu;
    private String materyalTipi;

    public void isbnGir(int isbn) {
        this.isbn = isbn;
    }

    public void kitaplikKoduGir(String kitaplikKodu) {
        this.kitaplikKodu = kitaplikKodu;
    }

    @Override
    public void adiGir(String materyalAdi) {
        this.materyalAdi = materyalAdi;
    }

    @Override
    public void materyalTipiGir(String materyalTipi) {
        this.materyalTipi = materyalTipi;
    }

    public String getMateryalAdi() {
        return materyalAdi;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getKitaplikKodu() {
        return kitaplikKodu;
    }

    public String getMateryalTipi() {
        return materyalTipi;
    }

}
