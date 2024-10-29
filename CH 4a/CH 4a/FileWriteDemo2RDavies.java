import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
This program writes data to a file. It makes sure the
specified file does not exist before opening it.

@author Ryan Davies
@version 10/10/2024
 */

public class FileWriteDemo2RDavies
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

        // Make sure the file does not exist.
        File file = new File(filename);
        if (file.exists())
        {
            System.out.println("The file " + filename +
                " already exists.");
            System.exit(0);
        }

        // Open the file.
        PrintWriter outputFile = new PrintWriter(file);

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

    //read file and count the number of students (newlines)
    public static void countStudents() throws IOException
    {
        File myFile = new File( "studentsByRDavies.txt" );
        Scanner inputFile = new Scanner( myFile );
        int numStudents = 0;
        while ( inputFile.hasNext())
        {
            numStudents++;
            String oneLine = inputFile.nextLine();
            System.out.println("Student #" + numStudents + ": " + oneLine);
        }
        System.out.println("\nThere are " + numStudents + " students.");

        inputFile.close();
    }

    //count number of 9th graders
    public static void count9thGraders() throws IOException
    {
        File myFile = new File( "studentsByRDavies.txt" );
        Scanner inputFile = new Scanner( myFile );
        int numStudents = 0;
        int numNinth = 0;
        System.out.println("9th grade students: ");
        //output each line and accumulate number of students
        while ( inputFile.hasNext())
        {
            numStudents++;
            String oneLine = inputFile.nextLine();
            //check each line for "9th grade"
            if((oneLine.indexOf("9th grade")) != -1)
            {
                numNinth++;
                System.out.println("#" + numStudents + ": " + oneLine);
            }
        }
        //output totals
        System.out.println("\nThere are " + numStudents + " students.");
        System.out.println("There are " + numNinth + " ninth graders.");
        //close file
        inputFile.close();
    }

    //count number of any grade
    public static void countAnyGrade() throws IOException
    {
        File myFile = new File( "studentsByRDavies.txt" );
        Scanner inputFile = new Scanner( myFile );
        int numStudents = 0;
        int numAny = 0;
        //get grade from user
        Scanner kb = new Scanner (System.in);
        System.out.print("What grade do you want to check? ");
        int grade = kb.nextInt();

        System.out.println("\n" + grade + "th grade students: ");
        //output each line and accumulate number of students
        while ( inputFile.hasNext())
        {
            numStudents++;
            String oneLine = inputFile.nextLine();
            //check each line for "-th grade"
            if((oneLine.indexOf(grade + "th grade")) != -1)
            {
                numAny++;
                System.out.println("#" + numStudents + ": " + oneLine);
            }
        }
        //output totals
        System.out.println("\nThere are " + numStudents + " students.");
        System.out.println("There are " + numAny + " " + grade + "th graders.");
        //close file
        inputFile.close();
    }

    //get student names
    public static void studentNames() throws IOException
    {
        File myFile = new File( "studentsByRDavies.txt" );
        Scanner inputFile = new Scanner( myFile );
        int numStudents = 0;
        
        //find each student and output line
        System.out.println("Outputting Student Names: \n");
        while ( inputFile.hasNext())
        {
            numStudents++;
            String oneLine = inputFile.nextLine();
            //start at the "Name:" field, offset by length of "Name:"
            String name = oneLine.substring( 6 + oneLine.indexOf("Name:") ); 
            System.out.println(numStudents + ": " + name);
        }
        
        //close file
        inputFile.close();
    }
}
