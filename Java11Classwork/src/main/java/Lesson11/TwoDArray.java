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
public class TwoDArray {
    public static void main(String[] args) {
        int [][] intArray= new int[4][4];
        
        intArray[0][0]=1;
        intArray[0][1]=2;
        intArray[0][2]=3;
        intArray[0][3]=4;
        intArray[1][0]=5;
        intArray[1][1]=6;
        intArray[1][2]=7;
        intArray[1][3]=8;
        intArray[2][0]=9;
        intArray[2][1]=10;
        intArray[2][2]=11;
        intArray[2][3]=12;
        intArray[3][0]=13;
        intArray[3][1]=14;
        intArray[3][2]=15;
        intArray[3][3]=16;
        
        for (var i= 0;i <intArray.length;i++){
            for (var j =0; j <intArray[1].length;j++){
                System.out.println("\tQ" + (j+i)+ ": " +intArray[i][j]);
            }
            System.out.println("\n");
        }
        
        
    }
    
}
