/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner in=new Scanner(System.in);
		String s=in.next();
		if(s.equals("Monday")||s.equals("Tuesday")||s.equals("Wednesday")||s.equals("Thursday")||s.equals("Friday"))
		System.out.print("No");
		if(s.equals("Saturday")||s.equals("Sunday"))
		System.out.print("YES");
	}
}
