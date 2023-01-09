package dailyprograms;

public class highestnumberbetweenfour {
static int a,b,c,d;
public static void main(String[]args)
{
	a=10;b=20;c=30;d=40;
	if(a>b)
	{
		if(a>c)
		{
			if(a>d)
			{
				System.out.println("Greater no is "+a);
			}
			else
			{
				System.out.println("Greater no is "+d);
			}
		}
		else
		{
			if(c>d)
			{
				System.out.println("Greater no is "+c);
			}
			else
			{
				System.out.println("Greater no is "+d);
			}
		}
	}
	else
	{
		if(b>c)
		{
			if(b>d)
			{
				System.out.println("Greater no is "+b);
			}
			else
			{
				System.out.println("Greater no is "+d);
			}
		}
		else
		{
			if(c>d)
			{
			System.out.println("Greater no is "+c);
			}
			else
			{
				System.out.println("Greater no is "+d);
			}
		}
	}
}
}
