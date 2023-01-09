package dailyprograms;

public class greaternobetweenthree {
	static int a=30;
	static int b=30;
	static int c=30;
	public static void main(String[]args) {
		if(a>b) 
		{
			if(a>c) 
			{
				System.out.println("largest no is "+a);
			}
			else
			{
				System.out.println("largest no is "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("largest no is "+b);
			}
			else
			{
				System.out.println("largest no is "+c);
			}
		}
	}

}
