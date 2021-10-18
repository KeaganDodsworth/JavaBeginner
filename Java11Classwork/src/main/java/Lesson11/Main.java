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
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain",'R',55.9,'M',"Short Sleeve");
        shirt01.display();
        System.out.println("============================");
        Pants pant01 = new Pants(32.5, 76.5, 'M', 87, "Jean Pants", 'B', 99.99);
        pant01.display();
        System.out.println("============================");
        Clothing pant02 = new Pants(30.5, 70.5, 'F', 43, "Jean Pants", 'B', 79.99);
        pant02.display();
        System.out.println("============================");
        System.out.println("Gender for itemID: "+ pant02.getItemId()+ " is " +((Pants)pant02).getGender());
        if (pant02 instanceof Pants){
            System.out.println("waist size of pants02 is "+ ((Pants)pant02).getWaistSize());
    }else{
            System.out.println("item is not pants");
 }
        System.out.println(((Shirt)shirt01).doReturn());
        System.out.println(pant02.toString());
}
    
    
} 