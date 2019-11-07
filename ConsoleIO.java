import java.util.Scanner;

public class ConsoleIO 
{
   public static String input(String txt)
   {
	   System.out.println(txt);
	   Scanner e = new Scanner (System.in);
	   return e.nextLine();
   }
   
   public static void outputChar(char txt)
   {
	   System.out.println(txt);
   }
   
   public static void output(String txt)
   {
	   System.out.println(txt);
   }
   
   public static int inputInt(String txt)
   {
	   System.out.println(txt);
	   Scanner e = new Scanner(System.in);
	   return e.nextInt();
   }
   
}
