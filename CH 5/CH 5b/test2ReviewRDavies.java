import java.util.Scanner;

/**
 * Write a description of class test2Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test2ReviewRDavies
{
    public static void sumOfNumbers()
    {
        int num = getNumber();
        int sum = 0;
        
        //add all nums from 0-num
        for(int i = 0; i <= num; i++)
        {
            sum += i;
        }
        
        //output sum
        System.out.println("Sum of all nums from 0 to " + num + " is " + sum);
    }
    //prompts user for integer from console
    public static int getNumber(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return kb.nextInt();
    }
}
