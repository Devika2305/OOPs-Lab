package com.R177219073.q2;
import java.util.*;
public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int sq[]=new int[10];
		int snum=0;
		int ssq=0;
		System.out.println("Enter numbers");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
			sq[i]=arr[i]*arr[i];
			snum=snum+arr[i];
			ssq=ssq+sq[i];
		}
		System.out.println("Numbers Entered");
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSquares of Numbers Entered");
		for(int i=0;i<10;i++){
			System.out.print(sq[i]+" ");
		}
		System.out.println("\nSum of Numbers Entered= "+snum);
		System.out.println("Sum of Squares of Numbers Entered= "+ssq);
		sc.close();
	}
}