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
public class FinalD {
    public static void main(String args[]) {  
    ErrorMsg err = new ErrorMsg();  
  
    System.out.println(err.getErrorMsg(err.OUTERR));  
    System.out.println(err.getErrorMsg(err.DISKERR));  
  }  
}
