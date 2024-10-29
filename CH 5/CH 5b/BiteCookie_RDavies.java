import java.util.Scanner;
//import java.awt.Color;
import java.awt.Font;
/**
 * Description
 * ______________________
 * ______________________
 * @author Ryan Davies
 * @version 10/22/2024  
 */
public class BiteCookie_RDavies
{
    public static void main(String[] args)
    {
    }

    //Original Student Code
    public static void bite()
    {
        Scanner keyboard = new Scanner(System.in);
        Draw scrn = new Draw();
        scrn.setTitle("Bite a Cookie By YName");
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);
        scrn.setPenColor(176, 195, 221);
        scrn.filledRectangle(200,200,200,200);
        scrn.setPenColor(Draw.BLACK);
        Font fnt = new Font("Arial", Font.BOLD, 14);
        scrn.setFont(fnt);
        scrn.text(100,216,"YName 10/20/2024");
        scrn.rectangle(100,300,100,100);
        scrn.setPenColor(139,69,19);
        scrn.filledCircle(100,300,75);
        scrn.setPenColor(205,133,63);
        scrn.filledCircle(97,297,73);
        scrn.setPenColor(90,35,15);
        scrn.filledCircle(69,244,5);
        scrn.filledCircle(136,250,5);
        scrn.filledCircle(106,275,5);
        scrn.filledCircle(59,277,5);
        scrn.filledCircle(94,300,5);
        scrn.filledCircle(156,300,5);
        scrn.filledCircle(40,310,5);
        scrn.filledCircle(74,322,5);
        scrn.filledCircle(114,320,5);
        scrn.filledCircle(133,350,5);
        scrn.filledCircle(74,357,5);
        double x,y;
        boolean keepRunning = true;
        while(keepRunning)
        {
            System.out.print("Type 'b' <Enter> to bite OR 'q' <Enter> to quit.");
            String input = keyboard.nextLine();

            if (input.equals("b"))
            {           
                x = scrn.mouseX();
                y = scrn.mouseY();
                if(x <= 200 && y >=200)
                {
                    scrn.setPenColor(176, 195, 221);
                    scrn.filledCircle(x, y, 20);
                }
            }

            if(input.equals("q"))
            {
                keepRunning = false;
            }
        }
        System.out.println("Program finished.");
    }

    //Label & Comment Each Section for Possible Methods
    public static void biteMethods1()
    {
        //setup scanner
        Scanner keyboard = new Scanner(System.in);

        //setup draw screen
        Draw scrn = new Draw();
        setup(scrn);

        //set name on graphics screen
        showTitle(scrn);

        //draw cookie
        drawCookie(scrn);

        //variables for storing mouse position
        double x,y;
        //sentinel
        boolean keepRunning = true;
        //verify user choice on input
        while(keepRunning)
        {
            //prompt user for input, either 'b' or 'q'
            System.out.print("Type 'b' <Enter> to bite OR 'q' <Enter> to quit.");
            //store input in String input
            String input = keyboard.nextLine();

            //check if user typed 'b' for bite
            if (input.equals("b"))
            {           
                //get values of cursor position
                x = scrn.mouseX();
                y = scrn.mouseY();
                //if the cursor is over the screen area, "bite"
                if(x <= 200 && y >=200)
                {
                    scrn.setPenColor(176, 195, 221);
                    scrn.filledCircle(x, y, 20);
                }
            }

            //check if user typed 'q' for quit
            if(input.equals("q"))
            {
                //set sentinel to false to exit
                keepRunning = false;
            }
        }
        //inform user program has terminated
        System.out.println("Program finished.");
    }
    
    //set up graphics screen
    public static void setup(Draw scrn)
    {
        scrn.setTitle("Bite a Cookie By RDavies");
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);        
        //background?
        scrn.setPenColor(176, 195, 221);
        scrn.filledRectangle(200,200,200,200);
    }
    
    //draw title on screen
    public static void showTitle(Draw scrn)
    {
        scrn.setPenColor(Draw.BLACK);
        Font fnt = new Font("Arial", Font.BOLD, 14);
        scrn.setFont(fnt);
        scrn.text(100,216,"RDavies 10/20/2024");
    }
    
    //create cookie
    public static void drawCookie(Draw scrn)
    {
        //cookie border
        scrn.rectangle(100,300,100,100);
        
        //actual cookie i'd guess
        scrn.setPenColor(139,69,19);
        scrn.filledCircle(100,300,75);
        scrn.setPenColor(205,133,63);
        scrn.filledCircle(97,297,73);

        //set color here, probably chocolate chips?
        scrn.setPenColor(90,35,15);
        scrn.filledCircle(69,244,5);
        scrn.filledCircle(136,250,5);
        scrn.filledCircle(106,275,5);
        scrn.filledCircle(59,277,5);
        scrn.filledCircle(94,300,5);
        scrn.filledCircle(156,300,5);
        scrn.filledCircle(40,310,5);
        scrn.filledCircle(74,322,5);
        scrn.filledCircle(114,320,5);
        scrn.filledCircle(133,350,5);
        scrn.filledCircle(74,357,5);
    }

}