package com.R177219073.q5;
import java.io.*;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		String name;
		int age;
		System.out.println("Enter employee details ");
		System.out.println("Enter name and age: ");
		Scanner in=new Scanner(System.in);
		try
		{
			if(!(in.nextLine().matches("[a-zA-Z]+")))
				throw new IOException();
			age=in.nextInt();
			if(age>50)
			{
				System.out.println("Age greater than 50 Exception");
				throw new Exception();
			}
			Employee x=new Employee();
			System.out.println("object created");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
}
