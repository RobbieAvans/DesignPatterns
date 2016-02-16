/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.Control;

import java.util.ArrayList;
import java.util.List;
import strategypattern.Abstraction.*;
import strategypattern.Presentation.ClockPresentation;

/**
 *
 * @author rebirth
 */
public class ClockControl {
    //private Clock clock;
    private Sound sound;
    private TimeZone timeZone;
    private ClockPresentation clockPresentation;
    private List<Clock> clocks = new ArrayList<Clock>();
    
    Thread ticker;
    
    public ClockControl(ClockPresentation clockPresentation) {
        this.clockPresentation = clockPresentation;
        initAnalogClock();
        initDigitalClock();
        NoTick();
        tick();
    }
    
    public void initDigitalClock() {
        clocks.add(new DigitalClock());
//        if (clock == null) {
//            clock = new DigitalClock();
//        } else {
//            clock = new DigitalClock();
//            drawPresentation();
//        }
    }
    
    public void initAnalogClock() {
        clocks.add(new AnalogClock());
//        if (clock == null) {
//            clock = new AnalogClock();
//        } else {
//            clock = new AnalogClock();
//            drawPresentation();
//        }
    }
    
    public void Tick() {
        sound = new Tick();
    }
    
    public void NoTick() {
        sound = new NoTick();
    }
    
    public void setUTC(){
        timeZone = new UTC();
        notifyAllObservers();
    }
    
    public void setMET(){
        timeZone = new UTC();
        timeZone = new MET(timeZone);
        notifyAllObservers();
    }
    
    public void setEST(){
       timeZone = new UTC();
       timeZone = new EST(timeZone);
       notifyAllObservers();
    }
    
    public void notifyAllObservers(){
        for(Clock clock : clocks){
            clock.setTimeZone(timeZone);
        }
    }
    
    public void drawPresentation() {
        clockPresentation.drawClock(clocks.get(0).drawClock(),clocks.get(1).drawClock());
    }
    
    public void tick() {
        ticker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        drawPresentation();
                        sound.playSound();
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        ticker.start();
    }
}
