import java.awt.*;

public class Post {

    private String title, content;
    private Image image;
    private Sharer sharer;

    public Post(String title, String content, Sharer sharer) {
        setTitle(title);
        setContent(content);
        setSharer(sharer);
    }

    public Post(String title, Image image, Sharer sharer) {
        setTitle(title);
        setImage(image);
        setSharer(sharer);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Sharer getSharer() {
        return sharer;
    }

    public void setSharer(Sharer sharer) {
        this.sharer = sharer;
    }

}
