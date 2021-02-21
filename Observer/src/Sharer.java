import java.util.ArrayList;
import java.util.List;

public abstract class Sharer {

    private String name;
    private List<IFollower> followerList;

    public Sharer(String name) {
        setName(name);
        followerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFollower(IFollower follower) {
        followerList.add(follower);
    }

    public void removeFollower(IFollower follower) {
        followerList.remove(follower);
    }

    public void notifyAll(Post post) {
        for (IFollower follower : followerList) {
            follower.notify(post);
        }
    }

    public abstract void share(Post post);

}
