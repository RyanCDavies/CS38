
/**
 * Description
 * test file for rolling two dice from the Dice_RD class in a simple
 * dice game
 *
 * @author Ryan Davies
 * @version 10/31/2024
 */
public class TesterRDavies
{
    public static void main()
    {
        
    }
    
    public static void testDice()
    {   //instantiate two friends dice for a game
        Dice_RD mike = new Dice_RD();
        Dice_RD leah = new Dice_RD();
        
        //fields to track score
        int leahWins = 0;
        int mikeWins = 0;
        int ties = 0;
        
        //roll the dice 10 times, taking note of the wins, losses, ties
        for(int i = 0; i < 10; i++)
        {
            //roll the dice
            leah.rollDice();
            mike.rollDice();
            
            //assign face values to temp variables
            int mikeTemp = mike.getFaceValue();
            int leahTemp = leah.getFaceValue();
            
            //check to see results of round of dice
            if( mikeTemp > leahTemp )
            {
                mikeWins++;
            }
            else if( mikeTemp == leahTemp )
            {
                ties++;
            }
            else
            {
                leahWins++;
            }
        }
        
        //output the final results
        System.out.println("Mike wins: "+mikeWins);
        System.out.println("Leah wins: "+leahWins);
        System.out.println("Ties: "+ties);
    }
    
    public static void testClock()
    {
        //instantiate a clock
        Clock_RD myWatch = new Clock_RD();
        
        //now we call Clock_RD methods
        myWatch.setHour(9);
        myWatch.setMinute(15);
        myWatch.setAmPm("pm");
        
        //now we call another method to check if correct
        String msg = myWatch.getTime();
        System.out.println( msg );
        
        for (int i = 0; i < 5; i++)
        {
            myWatch.advanceTime(10);
            
            msg = myWatch.getTime();
            System.out.println( msg );
        }
    }
}
