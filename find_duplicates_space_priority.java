import java.util.*;
import java.lang.*;
import java.io.*;

class dup
{
	public static void main(String args[])
	{
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n=in.nextInt();
		int[] a=new int[n];
		for(i=0;i<=n-1;i++)
		{
			
			System.out.print("Enter a["+i+"] : ");
			a[i]=in.nextInt();
			if(a[i]<0 || a[i]>n-1)
			{
				System.out.print("\nInvalid Input\n");
				i--;
			}	
		}
		System.out.print("\nArray:-\n");
		for(i=0;i<=n-1;i++)
			System.out.print(a[i]+" ");
		System.out.print("\nDuplicate elements: \n");
		for(i=0;i<=n-1;i++)
		{
			if(a[(int)Math.abs(a[i])]>=0)
				a[(int)Math.abs(a[i])]=-a[(int)Math.abs(a[i])];
			else
				System.out.print((int)Math.abs(a[i])+" ");
		}
	}
}