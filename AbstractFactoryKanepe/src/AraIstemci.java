public class AraIstemci {

    private ISoyutUrunIskelet iskelet;
    private ISoyutUrunKumas kumas;

    public AraIstemci(ISoyutFabrika sf) {
        kumas = sf.getKumas();
        iskelet = sf.getIskelet();
    }

    public void calistir() {
        String isk = iskelet.iskeletUret();
        String kum = kumas.kumasUret();

        System.out.println("Koltuk " + isk + " ve " + kum + " ile üretilmiştir.");
    }

}
