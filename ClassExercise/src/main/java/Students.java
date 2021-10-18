/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keagan Dodsworth
 */
public class Students {
    private String Name;
    private String Surname;
    private String Email;
    private String RepLink;

    public Students(String Name, String Surname, String Email, String RepLink) {
        this.Name = Name;
        this.Surname = Surname;
        this.Email = Email;
        this.RepLink = RepLink;
    }
    
    public Students(String Name, String Surname, String RepLink) {
        this.Name = Name;
        this.Surname = Surname;
        this.RepLink = RepLink;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getEmail() {
        return Email;
    }

    public String getRepLink() {
        return RepLink;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setRepLink(String RepLink) {
        this.RepLink = RepLink;
    }
    
    public void display() {
        System.out.println("Students{" + "Name=" + Name + ", Surname=" + Surname + ", Email=" + Email + ", RepLink=" + RepLink + '}');
    }
    
    
    
}
