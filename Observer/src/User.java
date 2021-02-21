public class User extends Sharer implements IFollower {

    private String mail;

    public User(String name, String mail) {
        super(name);
        setMail(mail);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void notify(Post post) {
        System.out.println(post.getSharer().getName() + " user's post notified as message to " + getName());
    }

    @Override
    public void share(Post post) {
        System.out.println(getName() + " user shared -> " + post.getTitle());
        notifyAll(post);
    }

}
