/**
 * MY SAD SECOND ATTEMPT AT DOING RECURSIONS THANKS AARON
 *
 * @author Cynthia Li
 */
public class workingRecursion
{
    public static void recursionRetry(String palindrome)
    {
	// Checks if symmetrical and print results
	if (recursion(palindrome))
	{
	    ConsoleIO.outputChar('\u000C');
	    ConsoleIO.output("This is a palindrome.");
	}

	else
	{
	    ConsoleIO.outputChar('\u000C');
	    ConsoleIO.output("This is not a palindrome.");
	}
    }

    public static boolean recursion(String pal)
    {
	// base case- stop if too short to not be palindrome
	if (pal.length() < 2)
	{
	    return true;
	} 
	
	else
	{
	    // checks ends are the same
	    boolean checkEnds = pal.substring(0, 1)
		    .compareTo(pal.substring(pal.length() - 1)) == 0;

	    // recursively checks middle
	    boolean result = checkEnds
		    && recursion(pal.substring(1, pal.length() - 1));

	    return result;
	}
	
    }

}