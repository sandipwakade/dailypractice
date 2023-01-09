package dailyprograms;

public class stringreverseprg {
	public static void main(String[]args)
	{
	String a = "Sandip";
	String b="";
	System.out.println(a);
	for(int i=(a.length()-1);i>=0;i-- )
	{
		b=b+a.charAt(i);
	}
	a=b;
	System.out.println(a);
	
	String c="Velocity Class Pune";
	String d="";
	System.out.println(c);
	for(int i=(c.lastIndexOf("e"));i>=0;i--)
	{
		d=d+c.charAt(i);
	}
	c=d;
	System.out.println(c);
	for (int i=0;i<=(a.length());i++)
	{
		System.out.println(c.charAt
				
				(i));
	}
	}
}
