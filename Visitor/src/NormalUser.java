public class NormalUser implements IMessageWork {

    @Override
    public void findPerson(String person) {
        System.out.println(person + " founded for normal user.");
    }

    @Override
    public void acceptMessage() {
        System.out.println("Message receiving for normal user.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sending for normal user.");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
