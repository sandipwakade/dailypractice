package dailyprograms;

public class printoddandevennumbers {
	static int first=0;
	static int last=100;
	public static void main(String[]args)
	{
		System.out.println("even numbers are :");
		for(first=0;first<=last;first++)
		{
			if(first%2==0)
			{
				System.out.print(first+", ");
			}
		}
		System.out.println();
		System.out.println("odd numbers are :");
		for(first=0;first<=last;first++)
		{
			if(first%2!=0)
			{
				System.out.print(first+", ");
			}
		}
	}

}
