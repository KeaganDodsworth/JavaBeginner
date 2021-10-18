/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keagan Dodsworth
 */
public class Caller {
    public static void main(String[] args) {
    
        // ElectronicDevice dev = new ElectronicDevice();
        ElectronicDevice dev = new Television();
        dev.turnOn(); // all ElectronicDevices can be turned on
        dev.setState(PowerState.ON);

    }
    
    
}
