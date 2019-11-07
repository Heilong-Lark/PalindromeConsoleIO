import apcslib.*;
/**
 * Write a description of class type2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class notRecursion
{
    public static void failRecursion(String pal)
    {   
        int o = pal.length() / 2;
        int r = o % 2;
        ConsoleIO.outputChar('\u000C');
        if (r == 0)
        {
           o = pal.length() / 2;
        }
        else
        {
           o += 1;
        }
        
        int n = 0;
        for (int i = 1; i <= o; i++)
        {
            String f = pal.substring(i-1, i);
            String l = pal.substring (pal.length()-i, pal.length()-i+1);
            
            //ConsoleIO.output("f: " + f);
            //ConsoleIO.output("l: " + l);
            
            if(f.compareTo(l) == 0)
            {
              n++;
              //ConsoleIO.output("n: " + n);
            }
        }
        //ConsoleIO.output("o: " + o);
        
        if (o == n)
        {
          ConsoleIO.output("This is a palindrome.");
            
        }
        
        else 
        {
           ConsoleIO.output("This is not a palindrome."); 
            
        }
    }
}
