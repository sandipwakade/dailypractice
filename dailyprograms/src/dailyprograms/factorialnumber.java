package dailyprograms;

public class factorialnumber {
	static int a=5;
	static int b,e,c;
	public static void main(String[]args)
	{
		b=a;
		e=1;
		System.out.print("Factorial of "+b);
		for(a=b;a>=1;a--)
		{
			c=e*a;
			e=c;
		}
		System.out.println(" is "+e);
	}

}
