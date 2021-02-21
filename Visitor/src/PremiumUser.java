public class PremiumUser implements IMessageWork {

    @Override
    public void findPerson(String person) {
        System.out.println(person + " founded for premium user.");
    }

    @Override
    public void acceptMessage() {
        System.out.println("Message receiving for premium user.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sending for premium user.");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
