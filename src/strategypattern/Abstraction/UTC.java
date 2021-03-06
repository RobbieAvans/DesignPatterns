package strategypattern.Abstraction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebirth
 */
public class UTC extends TimeZone {

   
    public UTC(){
        description = "UTC";
    }

    public Date dateNow() {
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(new Date()); 
        cal.getTime(); 
        return cal.getTime();
    }
}
