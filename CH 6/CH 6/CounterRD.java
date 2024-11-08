
/**
 * Create a counter that can be reset, incremented by 1, or
 * have the stored value returned.
 *
 * @author Ryan Davies
 * @version 11/7/2024
 */
public class CounterRD
{
    //fields
    private int count;
    
    //constructor
    CounterRD()
    {
        
    }
    
    //mutator methods
    //resets the count to 0
    public void reset()
    {
        count = 0;
    }
    //adds 1 to count
    public void increment()
    {
        count += 1;
    }
    
    //accessor methods
    //returns the value stored in count
    public int getCount()
    {
        return count;
    }
}
