
public class Q9 
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,1,2};
		
		int q = 0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				q=a[i+1];
			}
		}
		
		System.out.println("Min= "+q);

	}

}
