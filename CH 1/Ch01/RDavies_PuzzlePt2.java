
/**
 *
 * @Ryan Davies
 * @version 9-3-24
 */
public class RDavies_PuzzlePt2
{
    public static void RDavies_PuzzlePt2()
    {
        //define variables
        int topArea = 56;
        int topWidth;
        int topHeight = 7;
        int bottomArea;
        int bottomWidth;
        int bottomHeight = 6;
        
        //calculate
        topWidth = topArea/topHeight;
        bottomWidth = (topWidth - 4) + 5;
        bottomArea = bottomWidth * bottomHeight;
        
        //output
        System.out.println("The bottom area is: " + bottomArea);
        Draw puzzle = new Draw();
        puzzle.setXscale(0,400);
        puzzle.setYscale(400,0);
        puzzle.clear(Draw.WHITE);
        puzzle.setPenColor(Draw.BLACK);
        puzzle.text(200,200, "The bottom area is: " + bottomArea);
    }
}
