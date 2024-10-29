import java.awt.Font;
import java.util.Random;
/**
 * Description:
 * Outputs the coding proactice challenges to
 * the graphics screen
 * 
 * Author: Ryan Davies
 * Version: 10/3/2024
 */
public class HWLoops2RyanDavies
{
    public static void beachSunset()
    {
        //set up graphics screen
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        win.setPenColor(137, 206, 248);
        win.filledRectangle(200, 200, 200, 200);
        
        //sun
        win.setPenColor(197, 185, 127);
        win.filledCircle(200, 200, 70);
        win.setPenColor(255, 216, 1);
        win.filledCircle(200, 200, 50);
        
        //sea
        win.setPenColor(29, 141, 253);
        win.filledRectangle(200, 300, 200, 100);
        win.setPenColor(1, 90, 255);
        win.filledRectangle(200, 330, 200, 70);
        win.setPenColor(59, 220, 204);
        win.filledRectangle(200, 350, 200, 50);
        //reflections
        win.setPenColor(213, 198, 45);
        win.filledEllipse(200, 205, 60, 3);
        win.filledEllipse(165, 212, 40, 3);
        win.filledEllipse(255, 212, 40, 3);
        win.setPenColor(177, 189, 81);
        win.filledEllipse(230, 220, 40, 3);
        win.setPenColor(170, 184, 82);
        win.filledEllipse(190, 225, 30, 2.5);
        win.setPenColor(118, 170, 156);
        win.filledEllipse(155, 232, 30, 2.5);
        win.filledEllipse(235, 232, 30, 2.5);
        
        //beach 
        double x[] = {0, 300, 400, 400, 0};
        double y[] = {280, 330, 320, 400, 400};
        win.setPenColor(255, 255, 255);
        win.filledPolygon(x,y);
        y[0] = 290; y[1] = 360; y[2] = 330; y[3] = 400; y[4] = 400;
        win.setPenColor(244, 220, 176);
        win.filledPolygon(x,y);
        
        //tree
        //trunk
        win.setPenColor(158, 80, 49);
        double trunkX[] = {30, 55, 50, 55, 45, 35, 30};
        double trunkY[] = {340, 340, 280, 200, 200, 270, 340};
        win.filledPolygon(trunkX, trunkY);
        //leaves
        win.setPenColor(96, 155, 159);
        double leavesX[] = { 35,  30,   5,  25,   0,  30,  20,  45,  55,  65,  90,  80, 110,  90, 105,  75,  75,  55,  35};
        double leavesY[] = {230, 200, 210, 180, 165, 160, 130, 145, 115, 145, 130, 160, 165, 180, 210, 200, 230, 210, 230};
        win.filledPolygon(leavesX, leavesY);
        //coconuts
        win.setPenColor(145, 0, 4);
        win.filledCircle(45, 200,7);
        win.filledCircle(30, 185,7);
        win.filledCircle(50, 180,7);
        
        //foreground beach
        double x2[] = {0, 400, 400, 0};
        double y2[] = {340, 390, 400, 400};
        win.setPenColor(222, 180, 134);
        win.filledPolygon(x2, y2);
        
        //text
        Font fnt = new Font("Serif", Font.BOLD, 32);
        win.setFont(fnt);
        win.setPenColor(Draw.BLACK);
        win.text(200, 60, "Beach Sunset by Ryan Davies");
        win.setTitle("Beach Sunset by Ryan Davies");
    }
    
    public static void diceGame()
    {
        Random rand = new Random();
        int win = 0, loss = 0, tie = 0;
        for(int i = 0; i < 10; i++)
        {
            int cpu = 1 + rand.nextInt(6);
            int player = 1 + rand.nextInt(6);
            if (player > cpu)
            {
                win++;
            }
            else if (player < cpu)
            {
                loss++;
            }
            else
            {
                tie++;
            }
        }
        //determine winner
        String result;
        if (win > loss)
        {
            result = "You win!";
        }
        else if (win < loss)
        {
            result = "Computer Wins!";
        }
        else
        {
            result = "You Tied!";
        }
        
        //set up draw screen to display results
        Draw scr = new Draw();
        scr.setXscale(0,400);
        scr.setYscale(400,0);
        Font fnt = new Font("Helvetica", Font.BOLD, 45);
        scr.setFont(fnt);
        //title
        scr.setTitle("Dice Game by Ryan Davies");
        
        //display results
        scr.textLeft(100, 50, "Wins: " + win);
        scr.textLeft(100, 125, "Losses: " + loss);
        scr.textLeft(100, 200, "Ties: " + tie);
        scr.text(200, 300, result);        
    }
}
