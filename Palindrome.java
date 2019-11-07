import apcslib.*;
import java.util.Scanner;
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void Palindrome()
    {
     ConsoleIO.outputChar('\u000C');
     ConsoleIO.output("Lab Project: Palindrome in 3(4) Ways");
     String pal = ConsoleIO.input("What would you like to check?");
     
     //cleans up the string :))
     pal = pal.toLowerCase();
     pal = pal.replaceAll("\\s","");
     pal = pal.replaceAll("\\W","");

     
     int i = 0;
     while( i != 1 )
     {
      ConsoleIO.outputChar('\u000C');
      ConsoleIO.output("Your word: " + pal);
      ConsoleIO.output("---------------------------");
      ConsoleIO.output("Choose your way!");
      ConsoleIO.output("0. Exit Lab");
      ConsoleIO.output("1. Try another word");
      ConsoleIO.output("2. String Flipping");
      ConsoleIO.output("3. Failed Recursion");
      ConsoleIO.output("4. Nested Loops");
      ConsoleIO.output("5. Retrying to do Recursions");
    
      Scanner num = new Scanner(System.in);
      int tt = num.nextInt();
      int t = tt;
     
      if(t == 0)
      {
         System.exit(0);
      }
      if(t == 1)
      {
         Palindrome next = new Palindrome();
         next.Palindrome();

      }
      if(t == 2)
      {
         flipping choice2 = new flipping();
         choice2.flip(pal);
         
         ConsoleIO.output("--------------------");
         ConsoleIO.output("Enter any key to continue");
         Scanner end = new Scanner(System.in);
         String ender = end.nextLine();
      }
      if(t == 3)
      {
         notRecursion choice3 = new notRecursion();
         choice3.failRecursion(pal);
        
         ConsoleIO.output("--------------------");
         ConsoleIO.output("Enter any key to continue");
         Scanner end = new Scanner(System.in);
         String ender = end.nextLine();
      }
      if(t == 4)
      {
         nesting choice4 = new nesting();
         choice4.nested(pal);
        
         ConsoleIO.output("--------------------");
         ConsoleIO.output("Enter any key to continue");
         Scanner end = new Scanner(System.in);
         String ender = end.nextLine();
      }
      if(t == 5)
      {
         workingRecursion choice5 = new workingRecursion();
         choice5.recursionRetry(pal);
        
         ConsoleIO.output("--------------------");
         ConsoleIO.output("Enter any key to continue");
         Scanner end = new Scanner(System.in);
         String ender = end.nextLine();
      }
     }
    }
}
