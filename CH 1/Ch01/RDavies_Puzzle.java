/**
 * Description
 * ______________________
 * ______________________
 * @author Ryan Davies
 * @version 8/29/2024
 */
public class RDavies_Puzzle
{
    public static void main(String[] args)
    {
    }

    public static void puzzle1()
    {
        //setting up sides and areas
        int widthTop = 4;
        int widthBottom = widthTop + 3;
        int heightTotal = 10;
        int heightBottom;
        int heightTop;
        int areaTop;
        int areaBottom = 42;
        
        //math
        heightBottom = areaBottom / widthBottom;
        heightTop = heightTotal - heightBottom;
        areaTop = heightTop * widthTop;
        
        //output
        System.out.println("Top area is " + areaTop);
        Draw puz = new Draw();
        puz.setXscale(0,400);
        puz.setYscale(0,400);
        puz.clear(Draw.PINK);
        puz.setPenColor(Draw.YELLOW);
        puz.filledRectangle(200,200,100,100);
        puz.setPenColor(Draw.BLACK);
        puz.text(380, 200, "Top area is " + areaTop, 90);
        puz.setTitle("Puzzle 1 by RDavies");
        puz.setPenRadius(0.02);
        puz.line(390, 240, 390, 160);
    }

    public static void puzzle2()
    {
        //setting up the sides and areas
        int leftWidth;
        int rightWidth = 6;
        int totalWidth = 10;
        int height;
        
        int leftArea = 28;
        int rightArea;
        
        //math time
        leftWidth = totalWidth - rightWidth;
        height = leftArea / leftWidth;
        rightArea = rightWidth * height;
        
        //output
        System.out.println("Right area is " + rightArea);
        Draw puz = new Draw();
        puz.setXscale(0,400);
        puz.setYscale(0,400);
        puz.clear(Draw.GRAY);
        puz.setPenColor(Draw.WHITE);
        puz.text(200, 200, "Right area is " + rightArea);
        puz.setTitle("Puzzle 2 by RDavies");
    }

    public static void puzzle3()
    {
        
    }

}