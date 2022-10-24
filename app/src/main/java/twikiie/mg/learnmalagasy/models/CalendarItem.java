package twikiie.mg.learnmalagasy.models;

public class CalendarItem {
    private String name;
    private String translation;

    public CalendarItem(String name, String translation) {
        this.name = name;
        this.translation = translation;
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
}
