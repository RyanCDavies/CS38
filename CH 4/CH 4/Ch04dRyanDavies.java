import java.awt.Font;

/**
 * Description 
 * ____________
 * ____________
 * @author Ryan Davies
 * @version 10/1/2024
 */
public class Ch04dRyanDavies
{
    public static void main(String[] args)
    {

    }

    //New Topics: while loop 
    //Code Listing 4-3
    public static void whileLoop( )
    {
        int number = 1;

        while (number <= 5)
        {
            System.out.println("Hello");
            number++;
        }

        System.out.println("That's all!");

        //Graphics

        Draw   scr = new Draw( );
        scr.setXscale(0,400);
        scr.setYscale(400,0);
        scr.setTitle("Not a C++ Program --- Ryan Davies");
        Random rnd = new Random( );
        double x,y,width,height;
        number = 1;
        while (number <= 200 )
        {
            x = rnd.nextDouble( ) * 400;
            y = rnd.nextDouble( ) * 380 + 10;
            width  = 10;
            height = 30;
            //QQQ draw solid Red rectangles
            //on left half of the screen and
            //Green not solid rectangles on right half
            if ( x < 200)
            {
                scr.setPenColor(Draw.RED);
                scr.filledRectangle(x, y, width, height);
            }
            else
            {
                scr.setPenColor(Draw.GREEN);
                scr.rectangle(x, y, width, height); 
            }

            scr.rectangle(x,y,width,height);

            scr.pause(10);
            number++;
        }

    }

    //Code Listing 4-4
    public static void checkTemperature( )
    {
        final double MAX_TEMP = 102.5;  // Maximum temperature
        double temperature;             // To hold the temperature

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the current temperature.
        System.out.print("Enter the substance's Celsius temperature: ");
        temperature = keyboard.nextDouble();

        // As long as necessary, instruct the technician
        // to adjust the temperature.
        while (temperature > MAX_TEMP)
        {
            String msg = new String("The temperature is too high. Turn the\n");
            msg += new String("thermostat down and wait 5 minutes.\n");
            msg += "Then, take the Celsius temperature again\n"
            + "and enter it here: ";

            System.out.print(msg);
            temperature = keyboard.nextDouble();
        }

        // Remind the technician to check the temperature
        // again in 15 minutes.
        System.out.println("The temperature is acceptable.");
        System.out.println("Check it again in 15 minutes.");
    }

    //New Topic: Drawing Polygons
    public static void drawPoly()
    {
        Draw poly = new Draw();
        poly.setXscale(0,400);
        poly.setYscale(400,0);
        poly.setPenColor(90, 152, 110);
        //new material
        double[] x = {200, 400, 200, 200, 0};
        double[] y = {  0, 200, 400, 200, 200};
        poly.filledPolygon(x,y);
    }

    public static void flags()
    {
        Draw flag = new Draw();
        flag.setXscale(0,400);
        flag.setYscale(400,0);
        flag.clear(Draw.GRAY);

        //flag of czechia
        //white rectangle
        flag.setPenColor(Draw.WHITE);
        flag.filledRectangle(120, 237.5, 110, 37.5);
        //red rectangle
        flag.setPenColor(215, 20, 16);
        flag.filledRectangle(120, 312.5, 110, 37.5);
        //polygon time
        flag.setPenColor(17, 69, 126);
        double[] x = {10, 110, 10};
        double[] y = {200, 275, 350};
        flag.filledPolygon(x,y);

        //flag of tanzania
        //from 0-175, then from 0-150

    }

    //New Topics: rgb colors, validation loop, 
    //set screen location
    public static void colorBalls1()   
    {
        Random ran = new Random( );
        Scanner keyboard = new Scanner(System.in);
        int red, grn, blu, x, y, wd=40, ht=40;

        //validation loop
        int count = -1;
        while( count<0 || count>=99 ) 
        {
            System.out.print("Enter an integer 0-100: ");
            count = keyboard.nextInt();
        }

        //now count is good and we can use it
        Draw rgb = new Draw( );
        //rgb.setLocationOnScreen(50,60);
        rgb.setXscale(0,400);
        rgb.setYscale(400,0);
        rgb.setTitle("RGB demo by Ryan Davies");
        rgb.clear(Draw.BLACK);
        rgb.setPenColor(Draw.WHITE);
        Font fnt = new Font("Arial",Font.BOLD,32);
        rgb.setFont( fnt );        
        while( count>0 )
        {
            //Set a dark background
            rgb.clear(Draw.BLACK);

            //Set red, grn, blu to random integer 0-255            
            red = ran.nextInt(256);
            grn = ran.nextInt(256);
            blu = ran.nextInt(256);
            String msg = "red="+red+", grn="+grn+", blu="+blu;
            rgb.setPenColor(red,grn,blu);
            //Draw a circle in the middle    
            rgb.filledCircle(200,200,100);

            //Display a message rotated 90 deg
            rgb.setPenColor(Draw.WHITE);
            rgb.text(50,200,msg,90);

            //String word = keyboard.nextLine( );
            rgb.pause(1000);
            count--;
        }
    }

    //New Topics: rgb colors, validation loop, 
    //set screen location, polygon
    public static void colorTies1()
    {
        Random ran = new Random( );
        Scanner keyboard = new Scanner(System.in);
        int red, grn, blu; 

        //New material for drawing polygons
        double x[] = {200, 250, 200, 150};
        double y[] = {0,   300, 400, 300};
        //validation loop
        int count = -1;
        while( count<0 || count>=99 ) 
        {
            System.out.print("Enter an integer 0-100: ");
            count = keyboard.nextInt();
        }

        //now count is good and we can use it
        //Graphics part

        Draw tie = new Draw( );
        //rgb.setLocationOnScreen(50,60);
        tie.clear(Draw.BLACK);
        tie.setTitle("Color ties by YName");
        tie.setXscale(0,400);
        tie.setYscale(400,0);

        Font fnt = new Font("Algerian",Font.PLAIN,24);
        tie.setFont( fnt );        
        while( count>0 )
        {
            //make a dark background
            tie.clear(Draw.BLACK);

            //select random colors
            red = 123;
            grn = 123;
            blu = 123;
            tie.setPenColor(red,grn,blu);

            //draw the polygon
            tie.filledPolygon(x,y);

            //display the red, green, blue values rotated 90 degs
            tie.setPenColor(Draw.WHITE); 
            tie.text(50,200,"red="+red+", grn="+grn+", blu="+blu);

            //String word = keyboard.nextLine( );
            tie.pause(1000);
            count--;
        }
    }

    //Copy nervousEyes method here and add a nose

}
