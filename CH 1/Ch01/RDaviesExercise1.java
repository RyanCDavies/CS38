
/**
 * Write a description of class RDaviesExercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RDaviesExercise1
{

    /**
     * Constructor for objects of class RDaviesExercise1
     */
    public static void main()
    {
        Draw screen1 = new Draw();
        screen1.clear(Draw.RED);
        screen1.filledCircle(0.5,0.5,0.1);
        screen1.setPenColor(Draw.PINK);
        screen1.filledCircle(0,1,0.2);
        screen1.filledCircle(1,0.75,0.3);
        screen1.setPenColor(Draw.LIGHT_GRAY);
        screen1.circle(1,0.75,0.3);
        screen1.filledCircle(0.25,0.25,0.3);
    }
    
    public static void printExample()
    {
        Draw window = new Draw();
        window.clear(Draw.DARK_GRAY);
        window.setPenColor(Draw.LIGHT_GRAY);
        window.text(0.20, 0.25, "Programming is fun!");
        System.out.println("Programming is great fun!");  
    }
}
