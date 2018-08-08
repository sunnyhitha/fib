/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,n,s1=1,s2=1,sum;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<n)
		{
			System.out.print(s1+" ");
			sum=s1+s2;
			s1=s2;
			s2=sum;
			i++;
		}// your code goes here
	}
}
