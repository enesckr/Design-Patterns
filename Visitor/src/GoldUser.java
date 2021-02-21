public class GoldUser implements IMessageWork {

    @Override
    public void findPerson(String person) {
        System.out.println(person + " founded for gold user.");
    }

    @Override
    public void acceptMessage() {
        System.out.println("Message receiving for gold user.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sending for gold user.");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
