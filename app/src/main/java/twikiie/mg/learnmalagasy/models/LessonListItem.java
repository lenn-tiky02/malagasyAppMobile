package twikiie.mg.learnmalagasy.models;

public class LessonListItem {
    private int category;
    private String name;
    private String translation;
    private String filename;

    public LessonListItem(int category, String name, String translation, String filename) {
        this.category = category;
        this.name = name;
        this.translation = translation;
        this.filename = filename;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
