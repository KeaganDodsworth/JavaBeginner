/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap02;

/**
 *
 * @author keaga
 */
public class LToD {
    public static void main(String args[]) {    
    long L; 
    double D; 
   
    L = 100123285L; 
    //L = D;  Illegal!!! 
    D = L; 
   
    System.out.println("L and D: " + L + " " + D); 
   
  }    
}
