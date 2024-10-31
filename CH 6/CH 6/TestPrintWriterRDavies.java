import java.util.Scanner;  import java.util.Random; import java.io.*;
/**
 * Description 
 * outputs a 10x10 grid of random numbers 1-9 to the console
 * 
 * @author Ryan Davies
 * @version 10/31/2024
 */
public class TestPrintWriterRDavies
{
    public static void main(String[] args)  throws IOException
    {   //instantiate a PrintWriter object and a Random object
        PrintWriter output = new PrintWriter("RDavies.txt");
        Random      ran    = new Random();

        //PrintWriter method examples
        for(int row = 1; row <= 10; row++)   //for loop 10 times
        {
            int count = 1;
            String out = "";
            while (count <= 10)              //while loop 10 times
            {
                int number = ran.nextInt(9)+1; //random 1-9
                out += number;
                out += " ";
                count++;
            }
            output.print( out );
            System.out.println( out );
        }
        output.close();
    }
}
/*Sample Terminal output:
8 1 2 1 7 8 4 3 9 5 
3 7 1 8 7 1 4 6 9 2 
7 2 5 9 2 6 3 9 1 8 
8 6 9 6 1 7 6 3 9 1 
7 2 7 1 7 1 1 9 6 9 
6 4 9 9 9 4 3 3 4 4 
1 7 8 8 5 4 4 9 4 5 
4 6 2 1 2 7 7 7 1 3 
9 1 2 9 7 9 6 5 5 6 
2 2 2 7 9 3 4 8 5 1 
*/
