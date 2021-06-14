package com.R177219073.q2;

public class Hockey_Player extends Player{
	String game;
	Hockey_Player(String n,String g,int a){
		super(n,a);
		game=g;
	}
	void display() {
		super.display();
		System.out.println("Game played: "+game);
	}

}
