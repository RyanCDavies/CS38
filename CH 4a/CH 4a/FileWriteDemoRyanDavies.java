import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
   This program writes data to a file.
   
   @author Ryan Davies
   @version  10/8/2024
*/

public class FileWriteDemoRyanDavies
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // File name
      String friendName;    // Friend's name
      int numFriends;       // Number of friends

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();

      // Open the file.
      PrintWriter outputFile = new PrintWriter(filename + ".txt");

      // Get data and write it to the file.
      for (int i = 1; i <= numFriends; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter the name of friend " +
                          "number " + i + ": ");
         friendName = keyboard.nextLine();

         // Write the name to the file.
         outputFile.println(friendName);
      }

      // Close the file.
      outputFile.close();
      System.out.println("Data written to the file.");
   }
   
   public static void fileWriteDemo() throws IOException
   {
       PrintWriter myNote = new PrintWriter("RDavies.txt");
       myNote.println("What's up. I'm written in a file. Fancy");
       myNote.close();
   }
   
   public static void fileReadDemo() throws IOException
   {
       File myFile = new File("rdavies.txt");
       Scanner inputFile = new Scanner(myFile);
       while ( inputFile.hasNext())
       {
           String oneLine = inputFile.nextLine();
           System.out.println(oneLine);
       }
   }
   
   public static void pyramid() throws IOException
   {
       //set up file to store pyramid in and scanner to read
       //user input
       PrintWriter myFile = new PrintWriter("pyramid.txt");
       Scanner kb = new Scanner(System.in);
       
       //ask user for size of pyramid
       System.out.print("How tall would you like the pyramid to be? (size 1-10): ");
       int size = kb.nextInt();
       //sentinel to make sure size in range
       while (size < 0 || size > 10)
       {
          System.out.println("Error: " + size + " not in range 1-10");
          System.out.print("Enter another number in range: ");
          size = kb.nextInt();
       }
       
       //write the pyramid to file
       int count = 1;
       boolean swap = false;
       for (int i = 0; i < (2 * size); i++)
       {
           String output = "";
           for (int j = 0; j < count; j++)
           {
               output = output + "*";
           }
           //write to the file
           myFile.println( output );
           //check to see if we hit the midpoint
           if (swap == false && count < size)
           {
            count++;
           }
           else if (swap == false && count == size)
           {
               swap = true;
               count--;
           }
           else
           {
               count--;
           }
       }
       myFile.close();
       
       //set up for reading pyramid
       File inFile = new File("pyramid.txt");
       Scanner pyramid = new Scanner(inFile);
       
       //read pyramid time
       System.out.println("\nPyramid with height " + size + ":");
       while ( pyramid.hasNext() )
       {
           String oneLine = pyramid.nextLine();
           System.out.println(oneLine);
       }
   }
}
