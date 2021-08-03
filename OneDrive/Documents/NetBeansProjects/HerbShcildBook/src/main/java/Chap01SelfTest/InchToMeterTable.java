/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap01SelfTest;

/**
 *
 * @author keaga
 */
public class InchToMeterTable {
    public static void main(String[] args) {
        
 
    double inches, meters;
    int counter = 0;
    
    counter = 0; 
    for(inches = 1; inches <= 144; inches++) { 
      meters = inches / 39.37; 
      System.out.println(inches + " inches is " +  meters + " meters."); 
 
      counter++;    
      if(counter == 12) { 
        System.out.println(); 
        counter = 0; 
      } 
    } 
    
   
}  }