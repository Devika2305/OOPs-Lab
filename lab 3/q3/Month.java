package com.R177219073.q3;
import java.util.*;
public class Month {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    String m[]={"January","February","March","April","May","June","July","August","September","October","November","December"};			
			System.out.println("Enter a number between 1 to 12 ");
			int n=sc.nextInt();
			if(n>=1 && n<=12)
			{
			    System.out.println("Month Name: "+m[n-1]);
			}
			else
			{
			    System.out.println("Invalid Month Number");
			}
			
		}
}



