package com.R177219073.q1;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names= {"damon","stefan","klaus","elena","elijah","bonnie","hayley","alaric","hope","caroline"};
		int roll_no[]= {11,12,13,14,15,16,17,18,19,20};
		System.out.println("Enter index of details you want to see");
		int x= sc.nextInt();
		try {
			String s=names[x];
			int roll=roll_no[x];
			System.out.println("Name:"+s);
			System.out.println("Roll number:"+roll);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught:"+e);
			System.out.println("execution continued.");
		}
		sc.close();
		}

}
