
public class contiguous_subarray
{

	public static void main(String[] args) 
	{
		int[] a = {-2,-3,4,1,-2,1,5,-3};
		int maxsum=0,sum=0;
		int i;
		int n=8;
		for (i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(sum<0)
			{
				sum=0;
			}
			else if (sum>maxsum)
			{
				maxsum=sum;
			}
		}
		System.out.println(maxsum);
	}

}