package src.matthew.reyes.Exercise4;

/**
 * Created by victorreyes on 28/06/2016.
 */
public class PurchaseOrder {
    int POnumber;
    float[] quantity;
    String[] UOM;
    Item[] products;
    public PurchaseOrder(int POnumber, float[] quantity, String[] UOM, Item[] products) {
        this.POnumber = POnumber;
        this.quantity = quantity;
        this.UOM = UOM;
        this.products = products;


    }

    public int getPOnumber() {
        return POnumber;
    }

    public void setPOnumber(int POnumber) {
        this.POnumber = POnumber;
    }

    public float[] getQuantity() {
        return quantity;
    }

    public void setQuantity(float[] quantity) {
        this.quantity = quantity;
    }

    public String[] getUOM() {
        return UOM;
    }

    public void setUOM(String[] UOM) {
        this.UOM = UOM;
    }

    public Item[] getProducts() {
        return products;
    }

    public void setProducts(Item[] products) {
        this.products = products;
    }
}