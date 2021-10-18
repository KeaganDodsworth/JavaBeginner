/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8_1;

/**
 *
 * @author Keagan Dodsworth
 */
public class Item {
    char colour;

    public boolean setColour(char colourCode){
        if (colourCode == ' '){
            return false;
        }
        else {
            this.colour = colourCode;
            return true;
        }
    }
}
