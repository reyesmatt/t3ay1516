package src.matthew.reyes.Exercise4;

/**
 * Created by victorreyes on 26/07/2016.
 */
public class TotalAmount {
    public static void main(String[] args){
        float sum =0;
        float total = 0;
        Item HTC = new Item(1, "Cellphone", "Handheld", 55756.9f);
        Item Orange = new Item(2, "Oranges", "Food", 58.1f);
        Item Erasers = new Item(3, "Erasers", "Art Supplies", 15.6f);
        float [] quantity = {1, 10, 2};
        String [] UOM1 = {"Pieces", "Boxes", "Cases"};
        Item [] itemname = {HTC, Orange, Erasers};
        PurchaseOrder okay = new PurchaseOrder (1, quantity, UOM1, itemname);
        for(int i =  0; i < 3; i++)
        {
            System.out.print(okay.quantity[i] + " " + okay.UOM[i] + " of ");
            System.out.println(okay.products[i].getItemDescription()+" = Php "+ okay.quantity[i]*okay.products[i].getPrice());
            sum = okay.quantity[i] * okay.products[i].getPrice();
            total = total + sum;
        }
        System.out.println("Total Purchase: " + total);
    }
}