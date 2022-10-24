package twikiie.mg.learnmalagasy.models;

public class HomeItem {

    //fields
    private int categorie;
    private String itemName;
    private String imageName;

    //constructor
    public HomeItem(int categorie, String itemName, String imageName) {
        this.categorie = categorie;
        this.itemName = itemName;
        this.imageName = imageName;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
