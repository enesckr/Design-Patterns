public class EKitap implements IMateryal {

    private String webAdresi;
    private String materyalAdi;
    private String materyalTipi;

    public void webAdresiGir(String webAdresi) {
        this.webAdresi = webAdresi;
    }

    public String getWebAdresi() {
        return webAdresi;
    }

    @Override
    public void adiGir(String materyalAdi) {
        this.materyalAdi = materyalAdi;
    }

    public void materyalTipiGir(String materyalTipi) {
        this.materyalTipi = materyalTipi;
    }

    @Override
    public String getMateryalTipi() {
        return materyalTipi;
    }

    @Override
    public String getMateryalAdi() {
        return materyalAdi;
    }
}
