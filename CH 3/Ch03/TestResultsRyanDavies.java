import java.util.Scanner;
import java.util.Random;
import java.awt.Font;
/**
 * Write a description of class Decision03p1 here.
 *
 * @author Ryan Davies
 * @version 9/17/2024
 */
public class TestResultsRyanDavies
{
    //replace qqq, 1234 and _____
    public static void letterGrade( ) //pg 134
    {
        // Variable to hold the numeric test score
        int testScore;

        // Create a Scanner object for keyboard input.
        Scanner scanner = new Scanner(System.in);
        
        // Get the numeric test score.
        System.out.print("Enter your numeric test score: ");
        testScore = scanner.nextInt();

        // Display the grade.
        if (testScore < 60)
        {
            System.out.println("Your grade is F.");
        }
        else
        {
            if (testScore < 70)
            {
                System.out.println("Your grade is D.");
            }
            else
            {
                if (testScore < 80)
                {
                    System.out.println("Your grade is C.");
                }
                else
                {
                    if (testScore < 90)
                    {
                        System.out.println("Your grade is B.");
                    }
                    else
                    {
                        System.out.println("Your grade is A.");
                    }
                }
            }
        }
    }
}