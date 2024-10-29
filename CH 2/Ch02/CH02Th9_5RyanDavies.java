import java.awt.Font;
/**
 * Description
 * ______________________
 * ______________________
 * @author _____
 * @version ______
 */
public class CH02Th9_5RyanDavies
{
    public static void main(String[] args)
    {
    }

    public static void sect2_7()
    {
        int age = 19;
        age = age + 2;
        System.out.println("Age is " + age);
        //this is equivalent
        age += 2; //add two to age
        System.out.println("Age is now " + age);
        
        age -= 3; //subtract 3 from age
        System.out.println("Age after subracting 3 is " + age);
        
        age %= 7;
        System.out.println("The remainder of Age after " +
                            "dividing by 7 is " + age);
    }

    public static void graphicsFun()
    {
        //setting up our window
        Draw win = new Draw();
        win.clear(Draw.WHITE);
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //drawing the grid
        win.setPenColor(Draw.BLACK);
        win.line(200,0,200,400);
        win.line(0,200,400,200);
        
        //drawing the top left ellipse
        win.setPenRadius(0.005);
        win.setPenColor(Draw.RED);
        win.filledEllipse(100,100,50,95);
        win.setPenColor(Draw.BLACK);
        win.ellipse(100,100,50,95);
        
        //drawing the bottom right ellipse
        win.setPenRadius(0.007);
        win.setPenColor(Draw.MAGENTA);
        win.ellipse(300,300,95,65);
        win.setPenColor(Draw.YELLOW);
        win.filledEllipse(300,300,90,50);        
        
    }

    public static void fonts()
    {
        //draw window for big fonts
        Draw big = new Draw();
        big.setXscale(0,400);
        big.setYscale(400,0);
        big.setPenColor(Draw.BLACK);
        
        //make a new font!
        Font fnt = new Font("Arial", Font.PLAIN, 64);
        big.setFont(fnt);
        
        //now we write
        big.textLeft(20,200, "Hello World!");
        big.textLeft(10,255, "I am a big font!");
    }

}