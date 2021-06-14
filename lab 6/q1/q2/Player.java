package com.R177219073.q2;

public class Player {
	String name;
	int age;
	Player(String n, int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println("Player Name : "+name);
		System.out.println("Age : "+age);
	}

}
