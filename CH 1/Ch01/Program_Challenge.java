
/**
 * Write a description of class Program_Challenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program_Challenge
{
    public static void test()
    {
        Draw win = new Draw();
        win.clear(Draw.WHITE);
        win.setXscale(0,400);
        win.setYscale(400,0);
        win.setPenColor(Draw.BLACK);
        
        //xpos, ypos, width, height
        win.filledRectangle(150,100,50,100);
        win.filledRectangle(50,300,50,100);
        win.filledRectangle(300,300,100,100);
    }
}
