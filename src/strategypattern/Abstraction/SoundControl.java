package strategypattern.Abstraction;

import strategypattern.Control.ClockControl;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebirth
 */
public class SoundControl {

    Command slot;
    
    public SoundControl(){}
    
    public void setCommand (Command command){
        slot = command;
    }
    
    public void buttonWasPressed(){
        slot.execute();
    }
}
