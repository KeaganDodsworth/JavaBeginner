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
public class Pants extends Clothing {
    private double waistSize;
    private double lengthSize;
    private char gender;

    public Pants(double waistSize, double lengthSize, char gender, int itemID, String desc, char colour, double price) {
        super(itemID, desc, colour, price);
        this.waistSize = waistSize;
        this.lengthSize = lengthSize;
        this.gender = gender;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("waist :"+ getWaistSize());
        System.out.println("Length: " + getLengthSize());
        System.out.println("gender: " + getGender());
    }
    
    public double getWaistSize() {
        return waistSize;
    }

    public double getLengthSize() {
        return lengthSize;
    }

    public char getGender() {
        return gender;
    }

    public void setWaistSize(double waistSize) {
        this.waistSize = waistSize;
    }

    public void setLengthSize(double lengthSize) {
        this.lengthSize = lengthSize;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    
    
    
}
