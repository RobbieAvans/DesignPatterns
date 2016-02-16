package strategypattern.Abstraction;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.util.Date;
import javax.swing.JPanel;
import strategypattern.Abstraction.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebirth
 */
public interface Clock  {
    
    public JPanel drawClock();
    
    public void setTimeZone(TimeZone _timeZone);
    
    public TimeZone getTimeZone();

}
