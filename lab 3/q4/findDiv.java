package com.R177219073.q4;

public class findDiv {
	public static void main(String[] args) {
		int sum=0;
		for(int i=41;i<250;i++)
		{
			if(i%5==0)
				sum=sum+i;
		}
		System.out.println("Sum of numbers greater than 40 less than 250 and divisible by 5= "+sum);
	}

}
