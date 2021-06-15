package com.R177219073.q1;

interface test
{
	int square();
}
class arithimetic implements test
{
	int b;
	arithimetic(int x)
	{
		b=x;
	}
	public int square()
	{
		return (b*b);
	}
}
