package com.R177219073.q4;
import java.io.*;
class collision extends Exception
{
	collision(String s)
	{
		super(s);
	}
}
public class Vehicle {

	public static void main(String[] args) {
		String t1=null,t2=null;
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter the direction of vehicle1:(left/right):");
			t1=in.readLine();
			System.out.println("Enter the direction of vehicle2:(left/right):");
			t2=in.readLine();
			if(!t1.equals(12))
				throw new collision("truck 2 has to go on"+t1+" direction\n");
		}
		catch(collision e)
		{
			System.out.println(e);
			t2=t1;
			System.out.println("the collision has been avoided by redie=rection truck2\n");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("direction of truck1:"+t1+"\n");
		System.out.println("direction of truck2:"+t2+"\n");
	}

}
