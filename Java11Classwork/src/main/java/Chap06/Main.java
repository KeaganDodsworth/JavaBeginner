/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author Keagan Dodsworth
 */
public class Main {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();
        Customer customer03 = new Customer();
        Customer customer04 = new Customer();
        
        

        

//        customer01.name = "Keagan";
//        customer01.age = 19;
//        customer01.custID = 1332;
//        customer01.orderNum = 25;
//        customer01.address = "245 Woodlane Road";

          customer01.setName("James Brown");
          customer01.setAddress("13 Riley Street");
          customer01.setAge(55);
          customer01.setCustID(102);
          customer01.setOrderNum(29);
          
          System.out.println(customer01.getName());
          System.out.println(customer01.getAddress());
          System.out.println(customer01.getAge());
     
          

       // customer01.displayCustomer();

    }
}
