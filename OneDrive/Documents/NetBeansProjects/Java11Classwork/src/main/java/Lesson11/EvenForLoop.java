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
public class EvenForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 51; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
