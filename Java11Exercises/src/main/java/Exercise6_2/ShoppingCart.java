/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6_2;

/**
 *
 * @author Keagan Dodsworth
 */
public class ShoppingCart {
    public static void main(String[] args) {
        
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();
	
	item1.desc = "Apple";
        item2.desc = "Banana";

        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);
}
}
