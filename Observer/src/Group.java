public class Group implements IFollower {

    private String name;

    public Group(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notify(Post post) {
        System.out.println(post.getSharer().getName() + " user's post notified as mail to " + getName() + "'s members");
    }
}
