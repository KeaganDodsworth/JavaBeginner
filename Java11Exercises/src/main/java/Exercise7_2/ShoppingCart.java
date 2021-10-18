/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7_2;

/**
 *
 * @author Keagan Dodsworth
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Goku Kakarot";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
         
        sb = new StringBuilder(firstName);
        sb.append(" Kakarot");
	

        System.out.println(sb);
}
}