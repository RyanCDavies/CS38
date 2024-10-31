
/**
 * Description 
 * Draws a yellow draw screen and a white draw screen, waits 10
 * seconds, then recolors the white screen to green and draws a circle
 * 
 * @author Ryan Davies
 * @version 10/31/2024
 */
public class TestDrawRDavies
{
    public static void main(String[] args)
    {   //instantiate two draw objects, scrn1 and scrn2
        Draw scrn1 = new Draw( );
        Draw scrn2 = new Draw( );

        //Draw method examples. 
        //scrn2 has yellow background, wait 10secs
        scrn2.clear( Draw.YELLOW );
        scrn2.pause( 10000 );

        //scrn1 has green background, draw a ring near at (100,100)
        scrn1.clear( Draw.GREEN );
        scrn1.setXscale(0,400);
        scrn1.setYscale(400,0);
        scrn1.setPenRadius( 0.008 );
        scrn1.circle( 100, 100, 25 );
    }
}

