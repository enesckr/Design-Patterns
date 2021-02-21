public interface IMessageWork {

    void findPerson(String person);

    void acceptMessage();

    void sendMessage(String message);

    void accept(IVisitor visitor);

}
