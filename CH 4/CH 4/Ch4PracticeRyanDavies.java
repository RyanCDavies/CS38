import java.util.Random;
import java.awt.Font;
import java.util.Scanner;

/**
 * Practice based off of chapter 4 lecture.
 *
 * @author Ryan Davies
 * @version 9/24/2024
 */
public class Ch4PracticeRyanDavies
{
    public static void randomNumbersonGraphics()
    {
        //set up graphics screen
        Draw win = new Draw();
        win.clear(Draw.YELLOW);
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //set up large font
        Font fnt = new Font("DialogInput", Font.BOLD, 24);
        win.setFont(fnt);
        
        //write title to screen
        win.text(200, 75, "Random Numbers by Ryan Davies");
        
        //set up variable for randomness
        Random rand = new Random();
        
        //loop to write the random numbers
        for(int i = 0; i < 10; i++)
        {
            //find next position
            int xPos = 37 * (i + 1);
            //output random number to screen in correct position
            win.text(xPos, 100, "" + rand.nextInt(0,100));
        }

    }
    public static void coloredCircles()
    {
        //get draw window from helper function
        Draw win = window();
        win.clear(Draw.WHITE);
        
        //import random function
        Random rand = new Random();
        //set up scanner
        Scanner kb = new Scanner(System.in);
        
        //ask for how many circles to draw
        System.out.print("How many circles should I draw? ");
        int numCircles = kb.nextInt();
        //function to draw circles
        for(int i = 0; i < numCircles; i++)
        {
            //get random x and y coordinates
            int randX = rand.nextInt(0,400);
            int randY = rand.nextInt(0,400);
            
            //determine the color of the circle to draw
            if (randX < 200 && randY < 200)
            {
                win.setPenColor(Draw.BLUE);
            }
            else if (randX < 200 && randY >= 200)
            {
                win.setPenColor(Draw.GREEN);
            }
            else if (randX >= 200 && randY < 200)
            {
               win.setPenColor(Draw.RED); 
            }
            else
            {
                win.setPenColor(Draw.YELLOW);
            }
            
            //draw the circle now
            //get the size of the circle via random
            int randSize = rand.nextInt(15, 25);
            //draw finally
            win.filledCircle(randX, randY, randSize);
        }
    }
    public static void slidingCircle()
    {
        //set up window
        Draw win = window();
        win.clear(Draw.BLACK);
        win.setPenColor(Draw.WHITE);
        
        //draw the circle time
        int slides = 0;
        //outer loop, stops when we reach certain number of spins
        while (slides < 5)
        {
            //set up values to control the circle sliding
            int distX = 100;
            int distY = 100;
            int step = 10;
            int count = 200/step;
            int time = step * 5;
            //controls the top slide
            for(int i = 0; i < count; i++)
            {
                //update distX
                distX += step;
                //clear screen, draw circle
                win.clear(Draw.BLACK);
                win.filledCircle(distX, distY, 15);
                win.pause(time);
            }
            //controls the right slide
            for(int i = 0; i < count; i++)
            {
                //update distY
                distY += step;
                //clear screen, draw circle
                win.clear(Draw.BLACK);
                win.filledCircle(distX, distY, 15);
                win.pause(time);
            }
            //controls the bottom slide
            for(int i = 0; i < count; i++)
            {
                //update distX
                distX -= step;
                //clear screen, draw circle
                win.clear(Draw.BLACK);
                win.filledCircle(distX, distY, 15);
                win.pause(time);
            }
            //controls the right slide
            for(int i = 0; i < count; i++)
            {
                //update distY
                distY -= step;
                //clear screen, draw circle
                win.clear(Draw.BLACK);
                win.filledCircle(distX, distY, 15);
                win.pause(time);
            }
            slides += 1;
        }
    }
    public static void conditionalTest()
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int test = kb.nextInt();
        
        int output = test > 5 ? System.out.println(test + " is greater than 5") : System.out.println(test + " is less than 5");
    }
    public static Draw window()
    {
        //set up graphics screen
        Draw win = new Draw();
        win.clear(Draw.YELLOW);
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //set up large font
        Font fnt = new Font("DialogInput", Font.BOLD, 24);
        win.setFont(fnt);
        
        return win;
    }
}
