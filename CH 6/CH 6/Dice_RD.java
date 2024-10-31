import java.util.Random;

/**
 * Description
 * Ref: Module02 Fundamentals, 
 *      Java Templates & BlueJ Intro
 * Class name:
 * Fields:
 * Methods: 
 * @author Ryan Davies
 * @version 10/31/2024
 */
public class Dice_RD
{
    // fields. "What data does a die have?"
    private int faceValue;

    // constructor
    public Dice_RD()
    {
        
    }

    // mutators. "What can I do with a die?"
    //sets the die's value to newValue
    public void setFaceValue(int newValue)
    {
        faceValue = newValue;
    }
    
    //sets the die value to a random value 1-6
    public void rollDice( )
    {
        Random rnd = new Random( );
        faceValue  = rnd.nextInt(6)+1;
    }

    // accessor
    public int getFaceValue()
    {
        return faceValue;
    }
}
