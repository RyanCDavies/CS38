import java.util.Random;

/**
 * Write a description of class EXMousePosition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EXMousePosition
{
    public static void mousePosition()
    {
        Draw scrn = new Draw();
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);
        double x,y;
        int color;
        for(int i = 0; i < 20; i++){
            scrn.pause(500);
            x = scrn.mouseX();
            y = scrn.mouseY();
            System.out.printf(i + ": %.2f %.2f\n", x, y);
            scrn.clear();
            if(y != 0){
                color = 255/(int)y;
            }else{
                color = 255;
            }
            scrn.setPenColor(color,color,color);
            scrn.filledRectangle(200,200,200,200);
        }
    }

    public static void mousePosition2()
    {
        Draw scrn = new Draw();
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);
        double x,y;
        int color;
        boolean again = true;
        int i = 0;
        while(again){
            //increment the iteration counter
            i++;
            //waiting
            scrn.pause(500);
            //gets the mouse position
            x = scrn.mouseX();
            y = scrn.mouseY();
            //output x,y, and iteration values
            System.out.printf("%d: %,d %.1f\n", i, (int)x, y);
            //stop running when mouse is at top right
            if (x >= 390 && y <= 10){
                again = false;
            }
        }
    }

    public static void mousePosition3()
    {
        Draw scrn = new Draw();
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);
        scrn.clear(Draw.LIGHT_GRAY);
        scrn.setPenRadius(0.004);
        double x,y;
        boolean again = true;
        Random rand = new Random();
        int random;
        int i = 0;
        while(again){
            //increment the iteration counter
            i++;
            //waiting
            scrn.pause(500);
            //gets the mouse position
            x = scrn.mouseX();
            y = scrn.mouseY();
            //output x,y, and iteration values
            System.out.printf("%d: %,d %.1f\n", i, (int)x, y);

            //get colors - white, piink, yellow, grey, green, orange, red - 7 colors
            random = 2 * rand.nextInt(7);
            switch(random){
                    //white
                case 0:
                    scrn.setPenColor(Draw.WHITE);
                    break;
                    //pink
                case 2:
                    scrn.setPenColor(Draw.PINK);
                    break;
                    //yellow
                case 4:
                    scrn.setPenColor(Draw.YELLOW);
                    break;
                    //grey
                case 6:
                    scrn.setPenColor(Draw.GRAY);
                    break;
                    //green
                case 8:
                    scrn.setPenColor(35, 101, 51);
                    break;
                    //orange
                case 10:
                    scrn.setPenColor(Draw.ORANGE);
                    break;
                    //red
                case 12: 
                    scrn.setPenColor(Draw.RED);
                    break;
                default:
            }

            //get random to decide shape - 3 shapes, 3 cases
            random = rand.nextInt(12);
            switch (random){
                    //polygon
                case 0, 2, 4, 11:
                    double arrX[] = {x, x+20, x   , x-20, x};
                    double arrY[] = {y, y   , y-20, y   , y};
                    scrn.filledPolygon(arrX, arrY);
                    break;
                    //filled circle
                case 1, 3, 5, 10:
                    scrn.rectangle(x + 20, y, 20, 20);
                    break;
                    //rectangle
                case 6, 7, 8, 9:
                    scrn.circle(x - 20, y, 20);
                    break;
                default:
            }

            //stop running when mouse is at bottom right
            if (x >= 390 && y >= 390){
                again = false;
            }
        }
    }

    public static void dayAndNight()
    {
        Draw scrn = new Draw();
        scrn.setXscale(0,400);
        scrn.setYscale(400,0);
        double x,y;
        double color;
        boolean again = true;
        int i = 0;
        while(again){
            //increment the iteration counter
            i++;
            //waiting
            scrn.pause(200);
            //gets the mouse position
            x = scrn.mouseX();
            y = scrn.mouseY();
            //output x,y, and iteration values
            System.out.printf("%d: %,d %.1f\n", i, (int)x, y);

            //change background color
            //255 is white, 0 is black
            color = 255 * (400-y)/(double)400;
            System.out.println("Color is " + color);
            scrn.clear();
            scrn.setPenColor((int)color, (int)color, (int)color);
            scrn.filledRectangle(200,200,200,200);

            //draw sun
            scrn.setPenColor(238,210,2);
            scrn.filledCircle(x,y,15);
            scrn.setPenColor(255,255,0);
            scrn.filledCircle(x,y,10);

            //draw grass
            scrn.setPenColor(35, 101, 51);
            scrn.filledRectangle(200,300,200,100);

            //stop running when mouse is at top right
            if (x >= 390 && y <= 10){
                again = false;
            }
        }
    }
}
