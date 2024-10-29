/**
 * Description
 * ______________________
 * ______________________
 * @author Ryan Davies
 * @version 11/5/2024
 */
public class CircleRDavies
{
    // fields
    double radius;
    double PI;
    boolean isSolid;

    // constructor
    public CircleRDavies()
    {
        PI = 3.14159265359;
    }

    // mutators 
    public void setRadius(int newValue)
    {
        radius = newValue;
    }

    // accessors
    //returns radius of circle
    public double getRadius()
    {
        return radius;
    }

    //returns diameter of circle (radius x 2)
    public double getDiameter()
    {
        return radius * 2.0;
    }

    //returns circumference of circle (2 x PI x radius)
    public double getCircumference()
    {
        return (2 * PI * radius);
    }

    //draws the circle with object's values
    public void drawMe()
    {
        //setting up graphics
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);

        //drawing the circle
        if( isSolid )
        {
            win.filledCircle(200,200,radius);
        }
        else
        {
            win.circle(200,200,radius);
        }
    }
}