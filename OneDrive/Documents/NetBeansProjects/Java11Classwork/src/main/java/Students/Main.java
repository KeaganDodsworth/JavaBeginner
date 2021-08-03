/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author Keagan Dodsworth
 */
public class Main {
    public static void main(String[] args) {
       
    Students Student01 = new Students("01", "Keagan", "Dodsworth",19, "Keagan.dods@gmail.com","0769115370");
    Students Student02 = new Students("02", "Goku", "Kakarot",22, "kakarot@gmail.com","0754496633");
    Students Student03 = new Students("03", "Rick", "Sanchez",70, "rick@gmail.com","0764478331");
    Students Student04 = new Students("04", "Gianluca ", "Palmarozza",19, "GP@gmail.com","0867896543");
    Students Student05 = new Students("05", "Master", "Roshi", "MR@gmail.com","0876544567");
    
    Students[] Allstudents = {Student01,Student02,Student03,Student04,Student05 };
    
    for (Students students: Allstudents){
        System.out.println(students.getStudentDetils());
        System.out.println("==================================");
        
    }
    
    
}
}    
    

