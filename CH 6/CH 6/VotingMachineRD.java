
/**
 * Write a description of class VotingMachineRD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VotingMachineRD
{
    //fields
    int numRed;
    int numBlue;
    
    //methods
    //mutators
    public void clear()
    {
        numRed = 0;
        numBlue = 0;
    }
    
    public void voteRed()
    {
        numRed++;
    }
    
    public void voteBlue()
    {
        numBlue++;
    }
    
    //accessors
    public int getRed()
    {
        return numRed;
    }
    
    public int getBlue()
    {
        return numBlue;
    }
}
