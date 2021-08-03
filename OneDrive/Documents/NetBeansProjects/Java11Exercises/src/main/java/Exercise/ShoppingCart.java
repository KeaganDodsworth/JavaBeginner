/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Keagan Dodsworth
 */
public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart");
        
        
    boolean outOfStock ;
    int quantity = 3; 
    String[] names = {"Kakarot","Gianluca" ,"Gohan","Vegeta"};
    String item= "apple", customerName= names[0];
    double[] Prices = {1.4, 5.7, 8.3, 9.6};
    
    if (quantity >= 1){
        outOfStock=false;
    }
    else{
        outOfStock=true;
    };
    
    if (outOfStock == true){
        System.out.println(item+ "s are out of stock");
    }
    else{
        System.out.println(item);
    } 
        System.out.println(customerName + " wants to buy " + quantity + " apples");
        
        for (double Price :Prices){
            System.out.println(Price);
        }
    }
}
