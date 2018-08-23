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
		int n=in.nextInt();
		int a[]=new int[50];
		int i=0,b=0,sum=0,c=0;
		int g=n;
		while(n!=0){
			n=n/10;
			c++;
		}
		for(i=0;i<c;i++){
			a[i]=g%10;
			g=g/10;
			b=a[i]*a[i];
			sum=sum+b;
		}
		System.out.print(sum);
	}
}
