
/**
 * Simple intro to Java mutators/setters
 *
 * @author Ryan Davies
 * @version 10/29/2024
 */
public class NamesRDavies
{
    //instance variables - replace the example below with your data
    private String first;
    private String middle;
    private String last;
    private String prefix; //ex MR, Ms, Mrs, Dr
    
    //methods
    public void setFirstName( String newValue )
    {
        first = newValue;
    }
    
    public void setMiddleName( String newValue )
    {
        middle = newValue;
    }
    
    public void setLastName( String newValue )
    {
        last = newValue;
    }
    
    public void setPrefix( String newValue )
    {
        prefix = newValue;
    }
    
    public String toString()
    {
        String msg = last+", "+first;
        return msg;
    }
}
