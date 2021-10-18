/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keagan Dodsworth
 */
public class GroupB extends Students{
    private String CourseName;
    private int Attendance;
    private int ClassSize;

    public GroupB(String CourseName, int Attendance, int ClassSize, String Name, String Surname, String Email, String RepLink) {
        super(Name, Surname, Email, RepLink);
        this.CourseName = CourseName;
        this.Attendance = Attendance;
        this.ClassSize = ClassSize;
    }
    
    public GroupB(String CourseName, int Attendance, int ClassSize, String Name, String Surname, String RepLink) {
        super(Name, Surname, RepLink);
        this.CourseName = CourseName;
        this.Attendance = Attendance;
        this.ClassSize = ClassSize;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getAttendance() {
        return Attendance;
    }

    public int getClassSize() {
        return ClassSize;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setAttendance(int Attendance) {
        this.Attendance = Attendance;
    }

    public void setClassSize(int ClassSize) {
        this.ClassSize = ClassSize;
    }
    

    @Override
    public void display() {
         super.display();
        System.out.println( "GroupB{" + "CourseName=" + CourseName + ", Attendance=" + Attendance + ", ClassSize=" + ClassSize + '}'); 
    
    }
   

    


}

