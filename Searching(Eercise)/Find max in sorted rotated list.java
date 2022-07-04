
public class Q8 
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,1,2};
		
		int p = 0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				p=a[i];
			}
		}
		
		System.out.println("Max= "+p);		
	}

}
