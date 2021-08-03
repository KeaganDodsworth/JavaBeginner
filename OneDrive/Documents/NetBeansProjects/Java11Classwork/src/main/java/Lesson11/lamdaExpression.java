/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keagan Dodsworth
 */
public class lamdaExpression {
    public static void main(String[] args) {
        String[] names = {"Fred", "John", "Sipho","Hulk", "Steve"};
        List <String> myList = new ArrayList(Arrays.asList(names));
        
        for (String s: myList){
            System.out.println(s.toUpperCase()+ ","); 
            
        }
        
        //myList.replaceAll(s->s.toUpperCase());
        
        myList.removeIf(s ->s.equals("John"));
        myList.removeIf(s ->s.length()<5);
        
        System.out.println(myList);
    }
}
