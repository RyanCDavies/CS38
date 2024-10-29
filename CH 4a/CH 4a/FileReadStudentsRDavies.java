import java.io.*;
import java.util.Scanner;

/**
 * 
 *
 * @author Ryan Davies
 * @version 10/10/2024
 */
public class FileReadStudentsRDavies
{
    
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
    
    //find gpa
    public static void findGPA() throws IOException
    {
        File myFile = new File( "studentsByRDavies.txt" );
        Scanner inputFile = new Scanner( myFile );
        int numStudents = 0;
        double totalGPA = 0;
        
        //find each GPA and output on own line
        System.out.println("Outputting Student GPAs: \n");
        while ( inputFile.hasNext())
        {
            numStudents++;
            String oneLine = inputFile.nextLine();
            //start at the "Name:" field, offset by length of "Name:"
            String GPA = oneLine.substring( 4 + oneLine.indexOf("GPA:") ); 
            String output = GPA.substring(0, GPA.indexOf(","));
            System.out.println(numStudents + ": " + output);
            totalGPA += Double.valueOf(output);
        }
        totalGPA = totalGPA/numStudents;
        System.out.printf("Average GPA is: %.2f" , totalGPA);
        
        //close file
        inputFile.close();
    }
}
