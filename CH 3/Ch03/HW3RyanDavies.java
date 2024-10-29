import java.util.Scanner;
import java.awt.Font;

/*
*
 * Description
 *    program challenges from pg 303 (258) of the textbook
 *    
 * @author Ryan Davies
 * @version 9-15-2024
 */
public class HW3RyanDavies
{
    public static void main(String[] args)
    {          
    }

    public static void romanNumeral()
    {
        //setup scanner and get number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number in the range 1 to 10: ");
        int num = scanner.nextInt();

        //draw graphics screen and set up scale
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //draw grid lines
        win.setPenColor(Draw.GRAY);
        win.setPenRadius(0.005);
        win.line(200,0,200,400);
        win.line(0,200,400,200);
        
        //set up big fonts
        Font fnt = new Font("Helvetica", Font.BOLD, 32);
        win.setFont(fnt);
        
        //sign name
        win.setPenColor(Draw.BLUE);
        win.text(300, 20, "Ryan Davies");
        
        //change font for output
        fnt = new Font("Serif", Font.PLAIN, 24);
        win.setFont(fnt);
        win.setPenColor(Draw.BLACK);
        
        //change window title
        win.setTitle("HW3 Challenge #1 - Roman Numerals by Ryan Davies");
        
        //set up string to store roman numeral
        String roman = "";
        //check to see if number is outside the desired range
        if (num > 10 || num < 1){
            //print error to console
            System.out.println("Error: Invalid input (number not in range 1-10)");
            //print error to graphics screen
            win.text(300, 85, "Error: Invalid input");
            win.text(300, 115, "(number not in range 1-10)");
            
        }
        //program gets here if we pass the check
        else{
            //determine roman numeral value via a switch
            switch (num){
                case 1:
                    roman = "I";
                    break;
                case 2:
                    roman = "II";
                    break;
                case 3:
                    roman = "III";
                    break;
                case 4:
                    roman = "IV";
                    break;
                case 5:
                    roman = "V";
                    break;
                case 6:
                    roman = "VI";
                    break;
                case 7:
                    roman = "VII";
                    break;
                case 8:
                    roman = "VII";
                    break;
                case 9:
                    roman = "IX";
                    break;
                case 10:
                    roman = "X";
                    break;
                default:
                    roman = "Error";
            }
            
            //display the roman numeral value and the original number
            System.out.println("The roman numeral conversion of "
                               + num + " is " + roman + ".");
                               
            //write the roman numeral to the graphics screen
            win.text(300, 85, "The roman numeral");
            win.text(300, 115, "conversion of " + num + " is " + roman + ".");
        }
    }

    public static void sortedNames()
    {
        //set up scanner
        Scanner scanner = new Scanner(System.in);
        //ask user for three names
        System.out.println("Please input three names.");
        System.out.print("What is name one? ");
        String name1 = scanner.next();
        System.out.print("What is name two? ");
        String name2 = scanner.next();
        System.out.print("What is name three? ");
        String name3 = scanner.next();
        
        //ordering the names
        //set up final positions
        String firstName;
        String secondName;
        String thirdName;
        //check for first name
        if( (name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0) )
        {
            firstName = name1;
        }
        else if( (name2.compareTo(name1) < 0) && (name2.compareTo(name3) < 0) )
        {
            firstName = name2;
        }
        else
        {
            firstName = name3;
        }
        //check for second name
        if( (name1.compareTo(firstName) > 0 && ((name1.compareTo(name2) < 0) || (name1.compareTo(name3) < 0)) ) )
        {
           secondName = name1; 
        }
        else if( (name2.compareTo(firstName) > 0 && ((name1.compareTo(name1) < 0) || (name1.compareTo(name3) < 0)) ) )
        {
           secondName = name2; 
        }
        else
        {
            secondName = name3;
        }
        //check for third name
        if( (name1.compareTo(firstName) > 0) && (name1.compareTo(secondName) > 0) )
        {
            thirdName = name1;
        }
        else if( (name2.compareTo(firstName) > 0) && (name2.compareTo(secondName) > 0) )
        {
            thirdName = name2;
        }
        else
        {
            thirdName = name3;
        }
        
        //output to console
        System.out.println("The names in ascending order are: ");
        System.out.println(firstName + ", " + secondName + ", " + thirdName);
        
        //output to graphics
        //draw graphics screen and set up scale
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //draw grid lines
        win.setPenColor(Draw.GRAY);
        win.setPenRadius(0.005);
        win.line(200,0,200,400);
        win.line(0,200,400,200);
        
        //set up big fonts
        Font fnt = new Font("Helvetica", Font.BOLD, 32);
        win.setFont(fnt);
        
        //sign name
        win.setPenColor(Draw.BLUE);
        win.text(300, 20, "Ryan Davies");
        
        //change font for output
        fnt = new Font("Serif", Font.PLAIN, 24);
        win.setFont(fnt);
        win.setPenColor(Draw.BLACK);
        
        //change window title
        win.setTitle("HW3 Challenge #7 - Sorted Names by Ryan Davies");
        
        //write the names to the graphics screen
        win.text(300, 80, firstName);
        win.text(300, 95, secondName);
        win.text(300, 110, thirdName);
    }

    public static void runningTheRace()
    {
        //set up scanner
        Scanner scanner = new Scanner(System.in);
        //ask user for three names
        System.out.println("Please input three runner names and their times.");
        System.out.print("What is name one? ");
        String name1 = scanner.next();
        System.out.print("What is time one? ");
        double time1 = scanner.nextDouble();
        System.out.print("What is name two? ");
        String name2 = scanner.next();
        System.out.print("What is time two? ");
        double time2 = scanner.nextDouble();
        System.out.print("What is name three? ");
        String name3 = scanner.next();
        System.out.print("What is time three? ");
        double time3 = scanner.nextDouble();
        
        //draw graphics screen and set up scale
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);
        
        //draw grid lines
        win.setPenColor(Draw.GRAY);
        win.setPenRadius(0.005);
        win.line(200,0,200,400);
        win.line(0,200,400,200);
        
        //set up big fonts
        Font fnt = new Font("Helvetica", Font.BOLD, 32);
        win.setFont(fnt);
        
        //sign name
        win.setPenColor(Draw.BLUE);
        win.text(300, 20, "Ryan Davies");
        
        //change font for output
        fnt = new Font("Serif", Font.PLAIN, 24);
        win.setFont(fnt);
        win.setPenColor(Draw.BLACK);
        
        //change window title
        win.setTitle("HW3 Challenge #11 - Running the Race by Ryan Davies");
        
        //set up var to compare
        double firstTime;
        //ordering the runners by times
        System.out.println("The runners in order of their times are:");
        //check for first place
        if( time1 < time2 && time1 < time3 )
        {
            firstTime = time1;
            System.out.print(name1 + " - " + time1 + ", ");
            
            //print graphics
            win.text(300, 80, "First: " + name1 + " - " + time1);
        }
        else if(time2 < time1 && time2 < time3)
        {
            firstTime = time2;
            System.out.print(name2 + " - " + time2 + ", ");
            
            //print graphics
            win.text(300, 80, "First: " + name2 + " - " + time2);
        }
        else
        {
            firstTime = time3;
            System.out.print(name3 + " - " + time3 + ", ");
            
            //print graphics
            win.text(300, 80, "First: " + name3 + " - " + time3);
        }
        //check for second place
        if( time1 > firstTime && ((time1 < time3) || (time1 < time2)) )
        {
            System.out.print(name1 + " - " + time1 + ", ");
            
            //print graphics
            win.text(300, 100, "Second: " + name1 + " - " + time1);
        }
        else if( time2 > firstTime && ((time1 < time3) || (time1 < time1)) )
        {
            System.out.print(name2 + " - " + time2 + ", ");
            
            //print graphics
            win.text(300, 100, "Second: " + name2 + " - " + time2);
        }
        else
        {
            System.out.print(name3 + " - " + time3 + ", ");
            
            //print graphics
            win.text(300, 100, "Second: " + name3+ " - " + time3);
        }
        //check for third place
        if( time1 > time2 && time1 > time3 )
        {
            System.out.print(name1 + " - " + time1);
            
            //print graphics
            win.text(300, 120, "Third: " + name1 + " - " + time1);
        }
        else if(time2 > time1 && time2 > time3)
        {
            System.out.print(name2 + " - " + time2);
            
            //print graphics
            win.text(300, 120, "Third: " + name2 + " - " + time2);
        }
        else
        {
            System.out.print(name3 + " - " + time3);
            
            //print graphics
            win.text(300, 120, "Third: " + name3 + " - " + time3);
        }
    }
}