package strategypattern.Abstraction;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebirth
 */
public abstract class TimeZone {
    String description = "Timezone";
    
    public String getDescription(){
        return description;
    }
    
    public abstract Date dateNow();
}
