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
public class Main {
    public static void main(String[] args) {
        
        Customer customer01 = new Customer("Chuck Barry", 78, "Mississipi", 255,32);
        Customer customer02 = new Customer("Rick Sanchez", 70, "New York", 256,33);
        Customer customer03 = new Customer("Pickle Rick", 70, "Los Angeles", 257,34);
        Customer customer04 = new Customer("Tiny Rick", 70, "Gauteng", 258,35);
        
        Customer[] Customers ={customer01, customer02,customer03,customer04};
        
        for (Customer names: Customers){
            System.out.println("customer name: " + names.name);
            System.out.println("customer age: " + names.age);
            System.out.println("customer customID: " + names.custID);
            System.out.println("customer order number : " + names.orderNum);
            System.out.println("customer address: " + names.address);
            System.out.println("===============================================");
        }
        //customer01.displayCustomer();
        
         
        
//        Customer customer01 = new Customer();
//        Customer customer02 = new Customer();
//        Customer customer03 = new Customer();
//        Customer customer04 = new Customer();       

//        customer01.name = "Keagan";
//        customer01.age = 19;
//        customer01.custID = 1332;
//        customer01.orderNum = 25;
//        customer01.address = "245 Woodlane Road";

//          customer01.setName("James Brown");
//          customer01.setAddress("13 Riley Street");
//          customer01.setAge(55);
//          customer01.setCustID(102);
//          customer01.setOrderNum(29);
//          
//          System.out.println(customer01.getName());
//          System.out.println(customer01.getAddress());
//          System.out.println(customer01.getAge());
//     
          

       // customer01.displayCustomer();

    }
}
