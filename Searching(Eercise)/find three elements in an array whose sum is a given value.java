import java.util.Arrays;

public class Q16 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,5,2,4,6,1};
		
		Arrays.sort(a); 
		int value=8;
				
		for(int i=1;i<a.length-1;i++)
		{
			int j=i-1,k=i+1;
			
			while(j>=0 && k<a.length)
			{
				if((a[j]+a[i]+a[k])==value)
				{
					System.out.println(a[j]+" "+a[i]+" "+a[k]);
					k++;
					j--;
					
				}
				
				else if((a[j]+a[i]+a[k])>value)
				{
					j--;
				}
				
				else
				{
					k++;
				}
			}
		}
	}

}
