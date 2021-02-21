public class Page extends Sharer {

    public Page(String name) {
        super(name);
    }

    @Override
    public void share(Post post) {
        System.out.println(getName() + " page shared -> " + post.getTitle());
        notifyAll(post);
    }

}
