
/**
 * Write a description of class Clock_RD here.
 *
 * @author RyanDavies
 * @version 10/31/2024
 */
public class Clock_RD
{
    //fields
    private int hour;
    private int minutes;
    private String amPm;
    
    //constructor
    public Clock_RD()
    {
        
    }

    //mutators
    public void setHour( int newValue )
    {
        hour = newValue;
    }
    
    public void setMinute( int newValue )
    {
        minutes = newValue;
    }
    
    public void setAmPm( String newValue )
    {
        amPm = newValue;
    }
    
    public void advanceTime( int newMinutes )
    {
        minutes = minutes + newMinutes;
        //check if we make it over 60 mins and reset
        if (minutes >= 60)
        {
            hour += 1;
            minutes = minutes - 60;
        }
        //check if we make it over midnight and reset
        if (hour > 12)
        {
            hour = hour - 12;
            if ( amPm.equals("am") )
            {
                amPm = "pm";
            }
            else
            {
                amPm = "am";
            }
        }
    }
    
    //accessors
    public String getTime()
    {
        String value = hour +":"+minutes+" "+amPm;
        return value;
    }
}
