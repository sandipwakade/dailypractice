package dailyprograms;

public class PALINDROMENO {
	//static int x,a,b,c,d,e,f;
	public static void main(String[]args)
	{   int x,a,b,c,d,e,f;
		e=0;
	x=a=704;
	System.out.println("number is "+x);
		for(f=1;f<=3;f++)
		{
		b=a%10;  //7			0		4
		a=a/10;  	//40		4		0	
		c=(10*e)+b;  // 7		70 		704
		e=c;		// 7		70
		}
		System.out.println("Reverse no is "+e);
		if(x==e)
		{
			System.out.println("Hence number is PALINDROM");
			
		}
		else
		{
			System.out.println("Hence number is Not PALIMDROM");
		}

}
}
