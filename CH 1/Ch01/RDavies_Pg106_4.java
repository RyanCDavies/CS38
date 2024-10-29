
/**
 * Write a description of class RDavies_Pg106_4 here.
 *
 * @Ryan Davies
 * @8/27/24
 */
public class RDavies_Pg106_4
{
    public static void main()
    {
        //initialize values
        int w = 5;
        int x = 4;
        int y = 8;
        int z = 2;
        //create result
        int result;
        
        //output time
        result = x + y;
        System.out.println("part a: " + result);
        result = z * 2;
        System.out.println("part b: " + result);
        result = y / x;
        System.out.println("part c: " + result);
        result = y - z;
        System.out.println("part d: " + result);
        result = w % 2;
        System.out.println("part e: " + result);
    }
    public static void graphics()
    {
        //initialize values
        int w = 5; int x = 4; int y = 8; int z = 2;
        //create result
        int result;
        //creating the window and setting the pen
        Draw window = new Draw();
        window.clear(Draw.DARK_GRAY);
        window.setPenColor(Draw.LIGHT_GRAY);
        window.setXscale(0,400);
        window.setYscale(400,0);
        
        //output time
        result = x + y;
        window.text(200, 100, "part a: " + result);
        result = z * 2;
        window.text(200, 150, "part b: " + result);
        result = y / x;
        window.text(200, 200, "part c: " + result);
        result = y - z;
        window.text(200, 250, "part d: " + result);
        result = w % 2;
        window.text(200, 300, "part e: " + result);
    }
    public static void graphics2()
    {
        //initialize values
        int w = 5; int x = 4; int y = 8; int z = 2;
        //create result
        int result;
        //creating the window and setting the pen
        Draw window = new Draw();
        window.clear(Draw.DARK_GRAY);
        window.setPenColor(Draw.LIGHT_GRAY);
        window.setXscale(0,400);
        window.setYscale(400,0);
        
        //output time
        result = x + y;
        window.text(200, 100, "part a: " + result);
        window.setPenColor(Draw.GREEN);
        result = z * 2;
        window.text(50, 150, "part b: " + result);
        window.setPenColor(Draw.RED);
        window.filledSquare(25, 300, 20);
        result = y / x;
        window.text(200, 200, "part c: " + result);
        result = y - z;
        window.text(200, 375, "part d: " + result);
        window.setPenColor(Draw.PINK);
        result = w % 2;
        window.text(360, 360, "part e: " + result);
    }
}