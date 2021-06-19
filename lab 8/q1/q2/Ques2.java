package com.R177219073.q2;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int den=0,num=20,div=0;
		try
		{
			div=num/den;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator is 0 so denominator changed to 1");
			den=1;
			div=num/den;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Answer: "+div);

	}

}
