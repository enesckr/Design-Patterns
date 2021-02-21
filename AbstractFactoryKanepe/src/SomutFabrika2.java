public class SomutFabrika2 implements ISoyutFabrika {
    @Override
    public ISoyutUrunKumas getKumas() {
        return new KadifeKumas();
    }

    @Override
    public ISoyutUrunIskelet getIskelet() {
        return new MetalIskelet();
    }
}
