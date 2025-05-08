public class AndroidVersion {
    String title;
    String description;
    int image;

    // Constructor
    public AndroidVersion(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    // Getters (optional but useful)
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
