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
public class Students {
    // display details
    private String ID;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Email;
    private String CellNumber;

    public Students(String ID, String FirstName, String LastName, int Age, String Email, String CellNumber) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Email = Email;
        this.CellNumber = CellNumber;
    }
    
    public Students(String ID, String FirstName, String LastName, String Email, String CellNumber) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.CellNumber = CellNumber;
    }

    public String getStudentDetils() {
        String TString = (ID + "\r\n"+ FirstName + "\r\n"+ LastName+ "\r\n" + Age+ "\r\n" + Email+ "\r\n" + CellNumber);   
        return TString;
} 

}




