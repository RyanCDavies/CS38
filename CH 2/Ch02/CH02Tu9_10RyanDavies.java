import java.awt.Font;
/**
 * Description
 * ______________________
 * ______________________
 * @author Ryan Davies
 * @version 9-10-2024
 */
public class CH02Tu9_10RyanDavies
{
    public static void main(String[] args)
    {
    }

    public static void logo()
    {
        //create window
        Draw win = new Draw();
        win.clear(Draw.LIGHT_GRAY);
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //set up pen and draw line
        win.setPenRadius(0.005);
        win.setPenColor(Draw.BLACK);
        win.line(0,400,400,0);
        win.line(400,400,0,0);
        
        //draw target logo
        win.setPenColor(Draw.RED);
        win.filledCircle(200,300,60);
        win.setPenColor(Draw.WHITE);
        win.filledCircle(200,300,40);
        win.setPenColor(Draw.RED);
        win.filledCircle(200,300,20);
               
        //draw target text
        //set up big font
        Font fnt = new Font("Helvetica", Font.BOLD, 32);
        win.setFont(fnt);
        //draw text
        win.setPenColor(Draw.RED);
        win.text(200, 380, "TARGET");
        
        //draw gridlines
        win.setPenColor(Draw.GRAY);
        for(int i = 40; i < 400; i += 40){
            win.setPenRadius(0.0025);
            win.line(0, i, 400, i);
            win.line(i, 0, i, 400);
        }
    }

    public static void panda()
    {
        //create window
        Draw win = new Draw();
        win.clear(Draw.GRAY);
        win.setXscale(0,400);
        win.setYscale(400,0);

        //draw body
        win.setPenColor(Draw.BLACK);
        win.filledCircle(200,400,175);
        //draw ears
        win.filledCircle(300,100,40);
        win.filledCircle(100,100,40);
        //draw head
        win.setPenColor(Draw.WHITE);
        win.filledCircle(200,200,125);
        //draw nose
        win.setPenColor(Draw.BLACK);
        win.filledEllipse(200,200,30,20);
        //draw left eye
        win.filledEllipse(150,170,25,35);
        win.setPenColor(Draw.WHITE);
        win.filledCircle(160,160,15);
        win.setPenColor(Draw.BLACK);
        win.filledCircle(160,160,7);
        //draw right eye
        win.filledEllipse(250,170,25,35);
        win.setPenColor(Draw.WHITE);
        win.filledCircle(240,160,15);
        win.setPenColor(Draw.BLACK);
        win.filledCircle(240,160,7);
        //draw mouth
        win.setPenColor(Draw.PINK);
        win.filledCircle(200,250,30);
        win.setPenColor(Draw.WHITE);
        win.filledRectangle(200,235,40,15);
        /*
        //draw gridlines
        win.setPenColor(Draw.LIGHT_GRAY);
        for(int i = 40; i < 400; i += 40){
            win.setPenRadius(0.0025);
            win.line(0, i, 400, i);
            win.line(i, 0, i, 400);
        }
        */
    }

    public static void method3()
    {
    }

}