package com.R177219073.q2;

public class Cricket_Player extends Player{
	String game;
	Cricket_Player(String n,String g,int a){
		super(n,a);
		game=g;
	}
	void display() {
		super.display();
		System.out.println("Game played: "+game);
		 
	}
}
