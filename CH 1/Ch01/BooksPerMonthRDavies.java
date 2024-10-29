/**
 * Description
 * This program demonstrates how a cast operator
 * can be used to prevent integer division.
 * ref: pg __________
 * @author Ryan Davies
 * @version 9-3-24
 */

public class BooksPerMonthRDavies
{
     public static void books( )
     {
          int books = 15,        // Number of books to read
              months = 6;        // Number of months to read them
          double booksPerMonth;  // Average books per month

          // Display the number of books I plan to
          // read and the number months in which I
          // plan to read them.
          System.out.print("I plan to read ");
          System.out.print(books + " books in ");
          System.out.println(months + " months.");
          
          // Calculate the average books per month.
          booksPerMonth = (double) books / months;
          
          // Display the average number of books per month.
          System.out.print("I will read an average of ");
          System.out.print(booksPerMonth);
          System.out.println(" books per month.");
          
          //draw a screen for this
          Draw screen = new Draw();
          screen.setXscale(0,400);
          screen.setYscale(400,0);
          screen.clear(Draw.GRAY);
          screen.setPenColor(Draw.WHITE);
          screen.text(200,50,"Ryan Davies");
          screen.text(200,200, "I plan to read " + books
                                + " books in " + months
                                + " months.");
          screen.text(200, 230, "I will read an average of "
                                + booksPerMonth + 
                                " books per month");
     }
}
// Expected output ============
//I plan to read 15 books in 6 months.
//I will read an average of 2.5 books per month.