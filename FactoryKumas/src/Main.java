public class Main {
    public static void main(String[] args) {

        IFabrika fabrika = new KumasFabrika();
        IKumas kumas = fabrika.fabrikaMetodu("keten");
        String uretilenKumas = kumas.kumasUret();

        System.out.println(uretilenKumas + " üretildi");

        kumas = fabrika.fabrikaMetodu("kadife");
        uretilenKumas = kumas.kumasUret();

        System.out.println(uretilenKumas + " üretildi");

    }


}
