package dailyprograms;

public class reversestring {
	public static void main(String[]args)
	{
		String a="SANDIP WAKADE";
		String x="";
		for (int i=(a.length()-1);i>=0;i--)
		{
			x=x+a.charAt(i);
			//System.out.println(x);
			
		}
		a=x;
		System.out.print(a);
	}

}

