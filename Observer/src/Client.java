import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Client {

    public static void main(String[] args) {

        User user1 = new User("ensckr", "ensckr@test.com");
        User user2 = new User("enocakir", "enocakir@test.com");
        User user3 = new User("eno", "eno@test.com");
        Group group = new Group("Software");
        Page page = new Page("Technology");

        user1.addFollower(user2);
        user1.addFollower(user3);
        user1.addFollower(group);
        page.addFollower(user1);
        page.addFollower(user2);
        page.addFollower(user3);
        page.removeFollower(user2);
        page.addFollower(group);

        user1.share(new Post("Image", getImage(), user1));
        page.share(new Post("Title", "Content", page));

    }

    public static BufferedImage getImage() {
        String imagePath = "Test Image";
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            return null;
        }
    }

}
