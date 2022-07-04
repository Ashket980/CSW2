public class Q2 
{
	public static void sort(int a[])
	{
		int l=0,i=0,r=a.length-1;
		
		while(i<=r)
		{
			if(a[i]==0)
			{
				int t=a[i];
				a[i]=a[l];
				a[l]=t;
				
				i++;
				l++;
			}
			else if(a[i]==2)
			{
				int t=a[i];
				a[i]=a[r];
				a[r]=t;
				
				r--;
			}
			else 
			{
				i++;
			}
		}
		for(int k:a)
		{
			System.out.println(k+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[] = {0,2,2,1,0,0,1,1,1,0,2,1,2};
		sort(a);
	}
}
