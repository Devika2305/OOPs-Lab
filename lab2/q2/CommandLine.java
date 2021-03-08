class CommandLine
{
public static void main(String args[])
{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[2]);
	char ch= args[1].charAt(0);
	
	if(ch == '+')
	{
		System.out.println("Sum of "+a+" and "+b+" : "+(a+b));
	}
	else if(ch == '-')
	{
		System.out.println("Difference of "+a+" and "+b+" : "+(a-b));
	}
	else if(ch == 'x' || ch == 'X')
	{
		System.out.println("Product of "+a+" and "+b+" : "+(a*b));
	} 
	else if(ch == '/')
	{
		System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	}
	else
	{	
		System.out.println("Wrong Input");
	}
}
}
