package com.R177219073.q3;

public class dailyworker extends Worker {
	int rate;
	dailyworker(int no,String n,int r){
		super(no,n);
		rate=r;
	}
	void company(int h) {
		show();
		System.out.println("Salary: "+rate*h);
	}
}
