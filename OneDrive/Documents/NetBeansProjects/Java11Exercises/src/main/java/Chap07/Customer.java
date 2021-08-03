/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07;

/**
 *
 * @author Keagan Dodsworth
 */
public class Customer {
    public String name;
    public int custID;
    public String address;
    public int orderNum;
    public int age;

    public Customer(String name, int custID, String address, int orderNum, int age) {
        this.name = name;
        this.custID = custID;
        this.address = address;
        this.orderNum = orderNum;
        this.age = age;
    }
    
   
    
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("ID: "+custID);
        System.out.println("Address: "+address);
        System.out.println("Order Number: "+orderNum);
        System.out.println("Age: "+age);
    }

 
    
    
}
