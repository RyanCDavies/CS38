import java.util.Scanner;
import java.awt.Font;
import java.util.Random;

/**
 * Description
 * 
 *
 *
 * @author Ryan Davies
 * @version 10/17/2024
 */
public class HWCookieMethods
{
    //the main method for drawing cookie and validating input
    public static void main(){
        //setup scanner and vars
        Scanner kb = new Scanner( System.in );
        char choice = ' ';
        double x = 0, y = 0;

        //setup window
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        win.setTitle( "Cookie Biting by Ryan Davies" );
        win.setPenColor(176, 196, 222);  //light blue
        win.filledRectangle(100,300,100,100);
        //setup font
        Font fnt = new Font("Arial", Font.PLAIN, 20);
        win.setFont( fnt );
        win.setPenColor(Draw.BLACK);
        win.text(100, 217, "Ryan Davies - 10/20/2024");
        //draw cookie
        drawCookie(win, x, y);
        
        //decide whether to bite, validate, or quit
        while (choice != 'q'){
            System.out.print("Press 'b' to take a bite or 'q' to quit: ");
            choice = kb.nextLine().charAt(0); //get the first character of the next line
            if (choice == 'b'){
                x = win.mouseX();
                y = win.mouseY();
                biteCookie(win, x, y);
            }
        }
        //output exit string to console
        System.out.println("'q' entered. Exiting program...");
    }
    //creates the cookie on the screen
    public static void drawCookie(Draw win, double x, double y){
        //setup random
        Random ran = new Random();
        //draw cookie
        win.setPenColor(139,69,19);   //dark brown
        win.filledCircle(100,300,75);
        win.setPenColor(205,133,63);  //light brown
        win.filledCircle(97,297,70.7);
        //chocolate chips
        win.setPenColor(90,35,15);    //reddish brown
        //randomizes horizontal chocolate chip position
        for(int i = 0; i < 4; i++){
            x = ran.nextInt(131) + 32;
            y = ran.nextInt(50) + 272;
            win.filledCircle(x,y,7);
        }
        //randomizes vertical chocolate chip position
        for(int i = 0; i < 4; i++){
            y = ran.nextInt(131) + 232;
            x = ran.nextInt(50) + 72;
            win.filledCircle(x,y,7);
        }
    }
    //bites the cookie at cursor position
    public static void biteCookie(Draw win, double x, double y){
        //check to see if cursor is in the right spot
        if (x <= 200 && y >= 200){
            win.setPenColor(176, 196, 222);  //light blue
            win.filledCircle(x, y, 25);
        }
        //cover up the other 3 quadrants in case
        win.setPenColor(Draw.WHITE);
        win.filledRectangle(200,100,200,100);
        win.filledRectangle(300,300,100,100);
        //rewrite name in case of biting        
        win.setPenColor(Draw.BLACK);
        win.text(100, 217, "Ryan Davies - 10/20/2024");
    }
}
