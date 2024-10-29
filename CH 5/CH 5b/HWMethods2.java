import java.util.Scanner;
import java.awt.Font;

/**
 * Write a description of class HWMethods2 here.
 *
 * @author Ryan Davies
 * @version 10/22/2024
 */
public class HWMethods2
{
    //helper function to make graphics easier
    public static Draw window()
    {
        //create draw screen
        Draw win = new Draw();
        win.setXscale(0,400);
        win.setYscale(400,0);

        //set up large font and print name
        Font fnt = new Font("Calibri", Font.PLAIN, 35);
        win.setFont( fnt );
        win.text(200, 350, "Ryan Davies");

        //return to smaller font
        fnt = new Font("Arial", Font.PLAIN, 20);
        win.setFont( fnt );

        return win;
    }

    //programming challenge #2 ch 5
    public static void retailPrice(){
        //setup scanner
        Scanner kb = new Scanner( System.in );
        //get markup and cost from user
        System.out.print("Enter wholesale cost: $");
        double cost = kb.nextDouble();
        System.out.print("Enter markup (percentage): ");
        double markup = kb.nextDouble();

        //get total cost
        double total = calculateRetail(cost, markup);
        System.out.printf("Total cost after markup is: $%.2f\n", total);

        //graphics
        Draw win = window();
        win.setTitle("Retail Price by RDavies");

        win.clear(Draw.LIGHT_GRAY);
        win.text(200,200, String.format("Cost after markup: $%.2f", total));
    }
    //sister method
    public static double calculateRetail(double cost, double markup){
        double total = cost * ( 1 + (markup/100) );
        return total;
    }

    //programming challenge #4 ch 5
    public static void paintEstimate(){
        //need to get from user the number of sqft to paint
        //book gives us 115 sqft = 1 gal and 8 hrs
        //we need 1 sqft = x gal and y hrs, get through common ratio
        //115 / 1 = 1 / x for gal and 115/8 = 1 / y for hrs
        //      x = 1 / 115               y = 8 / 115

        //get square footage from user
        System.out.print("How many square feet need to be painted?: ");
        Scanner kb = new Scanner( System.in );
        double sqft = kb.nextDouble();
        //get cost per gallon from user
        System.out.print("What is the paint price per gallon?: ");
        double costPGal = kb.nextDouble();
        System.out.println("---------------------------------------");

        //methods to get labor hours, labor cost, gallons required, cost of gallons, total cost
        double numHours = numHours( sqft );
        double costLabor = costLabor( numHours );
        double numGallons = numGallons( sqft );
        double costGallons = costGallons( numGallons, costPGal );
        double costTotal = costTotal( costLabor, costGallons );

        //output results
        System.out.printf("Number of labor hours: %.1f\n", numHours);
        System.out.printf("Cost of labor: $%.2f\n", costLabor);
        System.out.printf("Number of gallons: %.0f\n", numGallons);
        System.out.printf("Cost of paint: $%.2f\n", costGallons);
        System.out.printf("Total cost: $%.2f\n", costTotal);
        System.out.println("---------------------------------------");

        //graphics
        Draw win = window();
        win.setTitle("Paint Estimate by RDavies");

        win.clear(Draw.LIGHT_GRAY);
        win.text(200,100, String.format("Number of labor hours: %.1f\n", numHours));
        win.text(200,120, String.format("Cost of labor: $%.2f\n", costLabor));
        win.text(200,140, String.format("Number of gallons: %.0f\n", numGallons));
        win.text(200,160, String.format("Cost of paint: $%.2f\n", costGallons));
        win.text(200,180, String.format("Total cost: $%.2f\n", costTotal));
    }

    public static double numHours(double sqft ){
        double hrsPSqft = 8.0 / 115.0;
        return hrsPSqft * sqft;
    }

    public static double costLabor(double numHours){
        double costPHr = 18.0;
        return costPHr * numHours;
    }

    public static double numGallons(double sqft ){
        double galPSqft = 1.0 / 115.0;
        return Math.ceil( sqft * galPSqft );
    }

    public static double costGallons(double numGallons, double costPGal ){
        return numGallons * costPGal;
    }

    public static double costTotal(double costLabor, double costGallons){
        return costLabor + costGallons;
    }

    //programming challenge #6 ch 5
    public static void celsiusTempTable(){
        Draw win = window();

        for (int i = 0; i < 21; i++){
            System.out.printf("Fahrenheit: %.1f  ->  Celsius: %.1f\n", (double)i, celsius(i));
            String output = String.format("Fahrenheit: %.1f  ->  Celsius: %.1f", (double)i, celsius(i));
            win.text(200, 15 * (i+1),  output);
        }
    }
    //convert F to C
    public static double celsius(double temp){
        double celsius = (5.0/9.0) * (temp - 32.0);
        return celsius;
    }

    //programming challenge #7 ch 5
    public static void testAvgAndGrade(){
        Draw win = window();
        win.setTitle("Test Average and Grade by Ryan Davies");

        //set up scanner and arr to store score
        Scanner kb = new Scanner( System.in );
        int[] score = new int [5];

        //prompt user for scores
        System.out.println("Enter 5 test grades below:");
        for (int i = 0; i < 5; i++){
            //get grade from user
            System.out.print("Enter grade " + (i+1) + ": ");
            score[i] = kb.nextInt();
            //display what entered grade is
            System.out.println("Score " + score[i] + " is a " + determineGrade(score[i]));
        }
        
        //get average and return it
        String output = String.format("Average is %.1f", calcAverage(score[0], score[1], score[2], score[3], score[4]));
        System.out.printf(output + "%");
        
        //graphics
        win.text(200,200, output + "%");
    }

    public static double calcAverage(int score1, int score2, int score3, int score4, int score5){
        double average = (score1 + score2 + score3 + score4 + score5) / 5.0;
        return average;
    }

    public static char determineGrade(double score){
        if ( score > 89 ){
            return 'A';
        }
        else if ( score > 79 ){
            return 'B';
        }
        else if ( score > 69 ){
            return 'C';
        }
        else if ( score > 59 ){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
