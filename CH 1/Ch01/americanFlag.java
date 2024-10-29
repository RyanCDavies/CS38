/**
 * draw the american flag
 *
 * @Ryan Davies
 * @9-3-24
 */
public class americanFlag
{
    public static void americanFlag()
    {
        //set up the window
        Draw win = new Draw();
        win.clear(Draw.WHITE);
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //draw red stripes
        win.setPenColor(Draw.RED);
        for (int i = 0; i < 7; i++){
            win.filledRectangle(200, (64*i)+16, 200, 16);
        }
        
        //draw blue rectangle
        win.setPenColor(Draw.BLUE);
        win.filledRectangle(0,0,224,156);
        
        //set pen for stars
        win.setPenColor(Draw.WHITE);
        //draw stars
        for (int i = 0; i < 9; i++){
            //check if i is even            
            if (i % 2 != 0){
                //draw the wide lines
                for (int j = 0; j < 6; j++){
                    win.filledCircle((16*j)+16, (16*i)+16, 3);
                }
            }
            else{
                //draw the less wide lines
                for (int j = 0; j < 5; j++){
                    win.filledCircle((16*j)+24, (16*i)+16, 3);
                }
            }
        }
    }
}
