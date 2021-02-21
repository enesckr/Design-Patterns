public class Client {
    public static void main(String[] args) {

        IVisitor visitor = new DisplayStory();

        IMessageWork mw = new NormalUser();
        mw.accept(visitor);
        visitor= new SaveMessage();
        mw.accept(visitor);

        mw= new GoldUser();
        mw.accept(visitor);
        visitor = new DisplayStory();
        mw.accept(visitor);
    }
}
