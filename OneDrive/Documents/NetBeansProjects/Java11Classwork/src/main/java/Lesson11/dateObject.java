/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

        

/**
 *
 * @author Keagan Dodsworth
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println("Today's date: "+ myDate);
        
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Japanese Date: " + jDate);
        
        myDate= myDate.plusMonths(9);
        System.out.println(myDate);
        
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date is ISO_DATE_TIME format" + sDate);
        
        String fDate= myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Formatted with LONG format style: "+ fDate);
        
        
    }
}
