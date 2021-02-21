public class Client {

    public static void main(String[] args) {

        Local local = new Local();
        Intranet intranet = new Intranet();
        Internet internet = new Internet();

        internet.setNext(intranet);
        intranet.setNext(local);

        internet.implement(new Request("250.0.0.1", Request.Type.GET));

    }
}
