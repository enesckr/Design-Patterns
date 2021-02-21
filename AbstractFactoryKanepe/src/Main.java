public class Main {
    public static void main(String[] args) {

        ISoyutFabrika soyutFabrika = new SomutFabrika1();
        AraIstemci client = new AraIstemci(soyutFabrika);
        client.calistir();

        soyutFabrika = new SomutFabrika2();
        client = new AraIstemci(soyutFabrika);
        client.calistir();

    }
}
