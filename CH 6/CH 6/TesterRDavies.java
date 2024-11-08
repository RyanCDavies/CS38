import java.util.Random;
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
    
    public static void testCounter()
    {
        //we get our counters
        CounterRD myCounter = new CounterRD();
        CounterRD friendCounter = new CounterRD();
        
        //reset counters before the event
        myCounter.reset();
        friendCounter.reset();
        
        //check that the counters are reset correctly
        System.out.println("I have:     "+myCounter.getCount());
        System.out.println("Friend has: "+friendCounter.getCount());
        
        //getting silly with people entering and randomly assigning
        //them to me or the friend
        //setup random and temp var
        Random ran = new Random();
        int choice;
        for(int i = 0; i < 10; i++)
        {
            choice = ran.nextInt(2);
            switch(choice)
            {
                //person enters my door
                case 0:
                    myCounter.increment();
                    break;
                //person enters friend's door
                case 1:
                    friendCounter.increment();
                    break;
                default:
            }
        }
        
        //check to see what the coutners look like
        System.out.println("I have:     "+myCounter.getCount());
        System.out.println("Friend has: "+friendCounter.getCount());
    }
    
    public static void testVotingMachine()
    {
        //instantiate machine
        VotingMachineRD vote = new VotingMachineRD();
        
        //reset machine and print results
        vote.clear();
        System.out.println("Democrat votes: "+vote.getBlue()+
                            "\nRepublican votes: " +vote.getRed());
                            
        //randomly cast your vote for R or D
        Random ran = new Random();
        int choice;
        for(int i = 0; i < 50; i++)
        {
            choice = ran.nextInt(2);
            switch(choice)
            {
                //person votes blue
                case 0:
                    vote.voteBlue();
                    break;
                //person votes red
                case 1:
                vote.voteRed();
                    break;
                default:
            }
        }
        
        //output results
        System.out.println("Democrat votes: "+vote.getBlue()+
                            "\nRepublican votes: " +vote.getRed());
                            
        //check who wins the election
        if( vote.getBlue() > vote.getRed() )
        {
            System.out.println("Democratic candidate wins the election!");
        }
        else if( vote.getRed() == vote.getBlue() )
        {
            System.out.println("Election was a tie!");
        }
        else
        {
            System.out.println("Republican candidate wins the election!");
        }
    }
}
