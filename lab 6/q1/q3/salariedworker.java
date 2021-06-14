package com.R177219073.q3;

public class salariedworker extends Worker {
	int rate;
	salariedworker(int no,String n,int r){
		super(no,n);
		rate=r;
	}
	int hour=40;
	void company() {
		show();
		System.out.println("Salary: "+rate*hour);
		
	}

}
