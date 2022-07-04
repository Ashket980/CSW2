
public class Q3 
{
	public static void main(String[] args) 
	{
		int a[]= {3,-9,7,4,-1,-6,3};
		
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=key;
		}
		
		for(int y:a)
		{
			System.out.print(y+" ");
		}
	}

}
