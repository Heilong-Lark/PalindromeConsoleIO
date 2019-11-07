import apcslib.*;
/**
 * Write a description of class type3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nesting
{
    public static void nested(String pal)
    {
        int o = pal.length() / 2;
        int r = o % 2;
        if (r == 0)
        {
           o = pal.length() * 2;
        }
        else
        {
           o = pal.length() * 2 - 2;
        }
        
        int sameCount = -1;
        ConsoleIO.outputChar('\u000C');
        for (int i = 0; i < pal.length(); i++)
        {
            String frontWord = pal.substring(i, i+1);
            //ConsoleIO.output("frontWord: " + frontWord);
            
            for (int j = 0; j <= pal.length()-1; j++)
            {
              String backWord = pal.substring(pal.length()-j-1, pal.length()-j);
              //ConsoleIO.output("backWord: " + backWord);
              
              if (frontWord.compareTo(backWord) == 0)
              {
                sameCount++ ; 
              }
              else
              {
                sameCount += 0;
              }
              //ConsoleIO.output("i: " + i);
              //ConsoleIO.output("j: " + j);
              //ConsoleIO.output("sameCount: " + sameCount);
            }
        }
        
        //ConsoleIO.output("o: " + o);
        //ConsoleIO.output("sameCount: " + sameCount);
        
        if (o == sameCount)
        {
          ConsoleIO.output("This is a palindrome.");
            
        }
        else 
        {
           ConsoleIO.output("This is not a palindrome."); 
            
        }
    }  
}
