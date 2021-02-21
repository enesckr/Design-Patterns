public class SomutFabrika1 implements ISoyutFabrika {
    @Override
    public ISoyutUrunKumas getKumas() {
        return new KetenKumas();
    }

    @Override
    public ISoyutUrunIskelet getIskelet() {
        return new AhsapIskelet();
    }
}
