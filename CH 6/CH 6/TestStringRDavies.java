
/**
 * Description 
 * creats two strings "LA Dodgers" and "NY Yankees", then outputs
 * the length of "LA Dodgers", the first two characters of "NY Yankees",
 * and the string "LA Dodgers" in lowercase
 * 
 * @author Ryan Davies
 * @version 10/31/2024
 */
public class TestStringRDavies
{
    public static void main(String[] args)
    {
        String  word1 = new String("LA Dodgers"); //LA Dodgers
        String  word2 = new String("NY Yankees"); //NY Yankees
        
        //String method examples
        System.out.println( word1.length() );           //size of word1
        System.out.println( word2.substring(0,2) );     //NY
        System.out.println( word1.toLowerCase() );      //la dodgers
    }
}

