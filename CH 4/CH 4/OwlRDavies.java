import java.awt.Font;
/**
 * Write a description of class OwlRDavies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OwlRDavies
{
    public static void owl()
    {
        //set up window
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        //background
        win.setPenColor(112, 128, 144);
        win.filledRectangle(200,200,200,200);
        
        //sign the screen
        win.setPenColor(Draw.WHITE);
        Font fnt = new Font("Calibri", Font.BOLD, 32);
        win.setFont(fnt);
        win.text(20,200, "Owl by Ryan Davies", 90);
        win.setTitle("Owl by Ryan Davies");
        
        //branch
        win.setPenColor(Draw.BLACK);
        double x[] = {0, 390, 300, 0, 0};
        double y[] = {380, 360, 380, 400, 380};
        win.filledPolygon(x,y);
        
        //owl
        //body
        win.setPenColor(210, 180, 140);
        win.filledEllipse(200, 280, 140, 90);
        win.setPenColor(245, 222, 179);
        win.filledEllipse(200, 300, 100, 70);
        //wings
        win.setPenColor(160, 82, 45);
        win.filledEllipse(80, 270, 30, 60);
        win.filledEllipse(330, 270, 30, 60);
        
        //head
        win.setPenColor(139, 69, 19);
        win.filledEllipse(200, 140, 150, 120);
        //ears
        double earsX[] = {50, 80, 120, 280, 320, 350};
        double earsY[] = {130, 20, 60, 60, 20, 130};
        win.filledPolygon(earsX, earsY);
        //eye feathers
        win.setPenColor(210, 180, 140);
        win.filledCircle(130, 150, 80);
        win.filledCircle(270, 150, 80);
        
        //sclera
        win.setPenColor(Draw.WHITE);
        win.filledEllipse(140, 140, 50, 60);
        win.filledEllipse(260, 140, 50, 60);
        //iris
        win.setPenColor(Draw.BLACK);
        win.filledCircle(150, 130, 35);
        win.filledCircle(250, 130, 35);
        //pupils
        win.setPenColor(Draw.WHITE);
        win.filledCircle(150, 130, 10);
        win.filledCircle(250, 130, 10);
        
        //nose
        
        
        //guidelines
        win.setPenColor(Draw.LIGHT_GRAY);
        win.setPenRadius(0.002);
        for(int i = 0; i < 10; i++)
        {
            win.line(0, 40*i, 400, 40*i);
            win.line(40*i, 0, 40*i, 400);
        }
    }
}
