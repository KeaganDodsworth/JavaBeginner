/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07;

/**
 *
 * @author keaga
 */
public class Shapes5 {
    public static void main(String args[]) { 
    Triangle t1 = new Triangle(); 
    Triangle t2 = new Triangle("outlined", 8.0, 12.0); 
    Triangle t3 = new Triangle(4.0); 
 
    t1 = t2; 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t3: "); 
    t3.showStyle(); 
    t3.showDim(); 
    System.out.println("Area is " + t3.area()); 
 
    System.out.println(); 
  } 
}
