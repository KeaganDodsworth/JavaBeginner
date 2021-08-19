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
public class Triangle extends TwoDShape{
 private String style; 
   
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
}
