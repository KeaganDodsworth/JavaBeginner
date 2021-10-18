/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.MAY;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author Keagan Dodsworth
 */
public class ZoneDateTimePrac {
    public static void main(String[] args) {
        
    
    ZoneId SouthAfrica = ZoneId.of("Africa/Johannesburg");
    LocalDate date = LocalDate.of(2021,MAY,29);
    LocalTime time = LocalTime.of(10, 30);
    ZonedDateTime ZDateTime = ZonedDateTime.of(date, time, SouthAfrica);
    
        System.out.println("Zone dae time " + ZDateTime);
}
}