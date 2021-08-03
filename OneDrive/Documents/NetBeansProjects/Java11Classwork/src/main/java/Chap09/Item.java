/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09;

/**
 *
 * @author Keagan Dodsworth
 */
public class Item {
    private double price ;
    public void setPrice(double price)
        {price =price*.85;}
    
    
    public Item (double price){
        this.price = price ;
    }

    public double getPrice() {
        return price;
    }
                     
}
