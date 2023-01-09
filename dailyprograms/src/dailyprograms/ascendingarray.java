package dailyprograms;

public class ascendingarray {
	public static void main(String[]args)
	{
	int a[]= {4,3,55,1};
	int e1;
	
	for(int i=0;i<=(a.length-1);i++)
	{
	
	System.out.print(a[i]+",");
	}
	System.out.println();
	
	for(int c=0;c<=(a.length-1);c++)
	{
		for(int b=0;b<(a.length-1);b++)
		{
			if(a[b]<a[b+1])
			{
				 e1=a[b];
				a[b]=a[b+1];
				a[b+1]=e1;
				
			}
		}
		
		
	}
	for(int i=0;i<=(a.length-1);i++)
	{
	
	System.out.print(a[i]+",");
	}
	}
	

}






