import apcslib.*;
/**
 * Write a description of class type1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class flipping
{
    public static void flip(String pal)
    {
        String original = pal;
        String flipped = "";
        for (int i = 1; i <= original.length(); i++)
        {
          String f = original.substring(original.length()-i, original.length()-i+1);
          flipped += f;
          
          //ConsoleIO.output("letter:" + f );
          
        }
        ConsoleIO.outputChar('\u000C');
        ConsoleIO.output(original + " flipped is "+ flipped);
        
        if (original.equals(flipped))
        {
          ConsoleIO.output("This is a palindrome.");
            
        }
        
        else 
        {
           ConsoleIO.output("This is not a palindrome."); 
            
        }
        
    }
}
