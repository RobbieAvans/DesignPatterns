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
public class SoundOnCommand implements Command {

    ClockControl clockControl;
    
    public SoundOnCommand(ClockControl clockControl){
        this.clockControl = clockControl;
    }
    
    public void execute(){
        clockControl.Tick();
    }
}
