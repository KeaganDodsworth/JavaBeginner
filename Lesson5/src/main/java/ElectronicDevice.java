/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keagan Dodsworth
 */
public abstract class ElectronicDevice {
    
    public abstract void turnOff();
    public abstract void turnOn();
    
    public void setState(PowerState state){
        switch (state){
            case OFF:

































































































































































               System.out.println(PowerState.OFF);
                break;
            case ON:
                System.out.println(PowerState.ON);
                break;
            case SUSPEND:
                System.out.println(PowerState.SUSPEND);    
                break;
            default:
                System.out.println("There is no such state");
        }
    }
}






























