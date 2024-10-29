/**
   This program defines and calls a simple method.
*/

public class SimpleMethodRDavies //pg 123
{
   public static void main(String[] args)
   {
      System.out.println("______ in main method says hello.");
      displayMessage();
      System.out.println("____ says we are back in the main method.");
   }
   
   /**
      The displayMessage method displays a greeting.
   */
   
   public static void displayMessage()
   {
      System.out.println("_____ is now in the displayMessage method.");
   }
}