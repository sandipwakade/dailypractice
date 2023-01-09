package dailyprograms;

public class fibonacciseries {
	
	public static void main(String[]args)
	{
		int a1=0,a2=1,a3,i,no=10;
		System.out.print(a1+" "+a2);
		for (i=2;i<no;++i)
		{
			a3=a2+a1;
			System.out.print(" "+a3+ " ");
			a1=a2;
			a2=a3;
			
		}
	}

}
