package com.R177219073.q1;
import java.util.*;
public class combination
{
	public static void main(String[] args)	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [3];
		System.out.println("Enter any 3 digits b/w 0-9 in the array ");
		for(int i=0;i<3;i++)
			arr[i]=sc.nextInt();
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				for(int c=0;c<3;c++)
				{
					if (a!=b&&b!=c&&c!=a)
					      System.out.println(arr[a] + "" + arr[b] + "" + arr[c]);
		 	    }
		     }

	      }
		sc.close();
	 }
}