/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author Keagan Dodsworth
 */
public class Clothing {
    private int itemId= 0;
    private String desc ="description is required ";
    private char colourCode= 'U';
    private double Price = 0.0;
    
    public void display(){
        System.out.println("item: " + getItemId());
        System.out.println("description: " + getDesc());
        System.out.println("colourCode: " + getColourCode());
        System.out.println("price: "+ getPrice());
    
}

    public Clothing(int itemID, String desc, char colour, double price) {
        this.itemId= itemID;
        this.desc= desc;
        this.colourCode= colour;
        this.Price= price;
    }
    
    
    public int getItemId() {
        return itemId;
    }

    public String getDesc() {
        return desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public double getPrice() {
        return Price;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Clothing{" + "itemId=" + itemId + ", desc=" + desc + ", colourCode=" + colourCode + ", Price=" + Price + '}';
    }
    
    
}
