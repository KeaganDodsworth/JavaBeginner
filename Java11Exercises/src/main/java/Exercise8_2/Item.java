/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8_2;

/**
 *
 * @author Keagan Dodsworth
 */
public class Item {
    String desc;
    int quantity;
    double price;
    char colourCode = 'U';   

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colourCode);
    }

    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colourCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}
