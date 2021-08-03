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
public class argsArray {
    public static void main(String[] args) {
        System.out.println("Total is: "+ (args[0]+ args[1]));
        int args1 =Integer.parseInt(args[0]);
        int args2 =Integer.parseInt(args[1]);
        int Total =(args1 + args2);
        System.out.println("Total is: "+ Total);
    }
}
