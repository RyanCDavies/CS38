import java.awt.Font;
import java.util.Scanner;
import java.util.Random;

/**
 * Description 
 * ____________
 * ____________
 * @author Ryan Davies
 * @version 9-19-2024
 */
public class Ch03a_RyanDavies
{
    public static void main(String[] args)
    {

    }

    //Explain:
    //gets mom's and dad's ages from the keyboard, then decides which is greater
    public static void ifMomDad()
    {
        Scanner keyboard = new Scanner(System.in); //set up scanner to read input
        int momAge, dadAge;                        //create vars for mom and dad ages
        System.out.print("Mom's age: ");           //ask for moms age
        momAge = keyboard.nextInt();
        System.out.print("Dad's age: ");           //ask for dads age
        dadAge = keyboard.nextInt();

        if( dadAge<momAge )
        {
            System.out.println("Mom is older");
        }
        if( dadAge>momAge )
        {
            System.out.println("Dad is older");
        }
        //What if they are same age?
        if (momAge == dadAge)
        {
            System.out.println("Mom and dad are the same age");
        }
    }

    //Explain:
    //asks user for number of males, then randomly determines number of females, then outputs who is
    //more numerous to to console and graphics screen
    public static void ex03()
    {
        Scanner keyboard = new Scanner(System.in); 
        Random rand = new Random();

        System.out.print("Enter number of males, ex 24: ");
        int numMale = keyboard.nextInt();

        int numFemale = rand.nextInt(50); //let computer pick it
        System.out.println("Number of females: "+numFemale);

        if(numMale > numFemale)
        {
            System.out.println("More males");
        }
        else
            System.out.println("More females");

        Draw win = new Draw();
        win.clear(Draw.LIGHT_GRAY);
        Font fnt = new Font("Arial", Font.BOLD, 64);
        win.setFont( fnt );
        win.setXscale(0,400);
        win.setYscale(400,0);
        if(numMale > numFemale)
        {
            //123 graphics output
            win.text(200,200, "More males");
        }
        else
        {
            //123 graphics output
            win.text(200,200, "More females");
        }
    }  

    //ref pg220 count-control loop, four examples ====
    //Explain:
    //
    public static void if05()
    {
        //Use this to repeat instructions
        for(int count=1; count<=10; count=count+1)
        {
            //123 print your name
        }
    }

    //Explain:
    //
    public static void if06()
    {
        //Use this to repeat instructions
        for(int count=1; count<=10; count=count+1)
        {
            //123 print count all on ONE LINE
        }
    }

    //Explain:
    //
    public static void if07()
    {
        Draw yi = new Draw( );
        //Use this to repeat instructions
        for(int count=1; count<=10; count=count+1)
        {
            System.out.print(count + " ");
            yi.pause(1000);
        }
    }

    //Explain:
    //
    public static void if12( )
    {
        //ref if-else if-else
        Draw yi=new Draw( );
        yi.clear(Draw.WHITE);
        yi.setXscale(0,400);
        yi.setYscale(400,0);
        yi.setTitle("Top half is ___, else ___ by YName");

        Scanner keyboard = new Scanner(System.in);
        int x, y;
        for(int count=5; count>0; count=count-1)
        { 
            String msg = count + ") enter x and y, ex 50 140: "; 
            System.out.print( msg );
            x = keyboard.nextInt( );
            y = keyboard.nextInt( );

            //Draw cyan circle on left, red rectangle on right
            if( 123<123 )
            {
                //123 draw a solid cyan circle                
            }
            else
            {
                //123 draw solid red rectangle                
            }
        }
    }

   
   
    public static void nervousEyes( )
    {
    }

    public static void stringExercise()
    {
        //                                 111
        //                       0123456789012
        String str = new String("unforgettable");
        //words are for, get, forget, table, able
        String word = "";
        //we do 2 to 5 because the last value is where we stop (it is not added)
        word = str.substring(2,5);
        System.out.println(word);
        
        word = str.substring(5,8);
        System.out.println(word);
        
        word = str.substring(2,8);
        System.out.println(word);
        
        word = str.substring(8,13);
        System.out.println(word);
        
        word = str.substring(9,13);
        System.out.println(word);
        
        word = str.substring(2,13);
        System.out.println(word);
    }
    public static void stringEx2()
    {
        String str = "Grandmother";
        String word = "";
        
        //grand
        word = str.substring(0,5);
        System.out.println("Word is: "+word);
        //ran
        word = str.substring(1,4);
        System.out.println("Word is: "+word);
        //and
        word = str.substring(2,5);
        System.out.println("Word is: "+word);
        //mother
        word = str.substring(5);
        System.out.println("Word is: "+word);
        //other
        word = str.substring(6);
        System.out.println("Word is: "+word);
        //her
        word = str.substring(8);
        System.out.println("Word is: "+word);
        
        //bonus graphics screen content!
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        //fonts
        Font fnt = new Font("Helvetica", Font.BOLD, 32);
        win.setFont(fnt);
        
        //grand
        word = str.substring(0,5);
        win.textLeft(100, 100,"Subword 1 is: "+word);
        //ran
        word = str.substring(1,4);
        win.textLeft(100, 150, "Subword 2 is: "+word);
        //and
        word = str.substring(2,5);
        win.textLeft(100, 200, "Subword 3 is: "+word);
        //mother
        word = str.substring(5);
        win.textLeft(100, 250, "Subword 4 is: "+word);
        //other
        word = str.substring(6);
        win.textLeft(100, 300, "Subword 5 is: "+word);
        //her
        word = str.substring(8);
        win.textLeft(100, 350, "Subword 6 is: "+word);
    }
    public static void stringEx03Demo()
    {
        //string index guide      0123456789
        String word = new String("automobile");
        //has words like to, mob, auto, bile
        int pos;
        pos = word.indexOf("to");
        System.out.println("pos of to: "+pos);
        
        pos = word.indexOf("mob");
        System.out.println("pos of mob: "+pos);
        
        pos = word.indexOf("auto");
        System.out.println("pos of auto: "+pos);
        
        pos = word.indexOf("bile");
        System.out.println("pos of bile: "+pos);
        
        //Explain:
        //doesn't work since "M" is not the same as "m"
        pos = word.indexOf("Mobile");
        System.out.println("pos of Mobile: "+pos);
    }
    public static void stringEx03()
    {
        String word = new String("Grandmother");
        //again has grand, ran, and, mother, moth, other, her
        int pos;
        
        
        pos = word.indexOf("Grand");
        System.out.println("pos of Grand: "+pos);
        
        pos = word.indexOf("ran");
        System.out.println("pos of ran: "+pos);
        
        pos = word.indexOf("and");
        System.out.println("pos of and: "+pos);
        
        pos = word.indexOf("mother");
        System.out.println("pos of mother: "+pos);
        
        pos = word.indexOf("moth");
        System.out.println("pos of moth: "+pos);
        
        pos = word.indexOf("other");
        System.out.println("pos of other: "+pos);
        
        pos = word.indexOf("her");
        System.out.println("pos of her: "+pos);
        
        //shouldnt work correctly
        pos = word.indexOf("grand");
        System.out.println("pos of grand: "+pos);
    }
    public static void stringEx04()
    {
        String w1 = "unforget";
        String w2 = "Unforget";
        String w3 = "unforgotten";
        
        System.out.println("Is w1 the same as w2: "
                            + w1.equalsIgnoreCase(w2));
        boolean same;
        same = w1.equals(w2);
        System.out.println("Same if you don't ignore case? " 
                            + same);
        
        same = w1.equals(w3);
        System.out.println("are w1 and w3 the same? " + same);
        
        //ans = w1.compareTo(w2) says this:
        //"they are in alphabetical order" ans < 0 ie abcd....z
        //"the are the same" ans = 0
        //"otherwise" ans > 0 zyxw....cba
        int results;
        results = w1.compareTo(w2);
        System.out.println("compare w1, w2: " + results);
    }
    public static void simpleLoop()
    {
        Draw scr = new Draw();
        scr.setXscale(0,400);
        scr.setYscale(400,0);
        scr.clear(Draw.YELLOW);
        
        Random ran = new Random();
        scr.setPenColor(Draw.BLUE);
        for(int count = 1; count <= 123; count++)
        {
            System.out.println("Hello" + count);
            System.out.println("Everyone");
            double x,y;
            x = ran.nextInt(400);
            y = ran.nextDouble() * 400;
            scr.filledCircle(x,y,10);
            scr.pause(100);
        }
    }
}
