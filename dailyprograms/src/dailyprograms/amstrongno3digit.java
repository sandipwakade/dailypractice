package dailyprograms;

public class amstrongno3digit {
	static int x,a,b,c,d,e,f;
	public static void main(String[]args)
	{ e=0;
	x=a=153;
	System.out.println("number is "+x);
		for(f=1;f<=3;f++)
		{
		b=a%10;
		a=a/10;
		c=e+(b*b*b);
		e=c;
		}
		System.out.println("sum of cubes of its digits is "+e);
		if(x==e)
		{
			System.out.println("Hence number is amstrong");
			
		}
		else
		{
			System.out.println("Hence number is Not amstrong");
		}
		
	}


}
