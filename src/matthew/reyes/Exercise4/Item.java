package src.matthew.reyes.Exercise4;

/**
 * Created by victorreyes on 28/06/2016.
 */
public class Item {
    private int ItemId;
    private String ItemDescription;
    private String ItemType;
    private float Price;
    public Item(int ItemId, String ItemDescription, String ItemType, float Price) {
        this.ItemId = ItemId;
        this.ItemDescription = ItemDescription;
        this.ItemType = ItemType;
        this.Price = Price;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}