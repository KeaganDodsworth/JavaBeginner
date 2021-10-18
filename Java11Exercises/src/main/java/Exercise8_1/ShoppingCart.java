/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8_1;

/**
 *
 * @author Keagan Dodsworth
 */
public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();

        if (item1.setColour('G')){
            System.out.println("Item1 colour: "+item1.colour);
        }else System.out.println("Invalid colour");
    }
}
