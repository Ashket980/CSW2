public class Q3 
{
	static int minSwap(int arr[],int n,int k)
	{
		int c=0;
		for (int i=0;i<n;++i)
			if(arr[i]<=k)
				++c;
		
		int b =1;
		for (int i=0;i<c;++i)
			if(arr[i]>k)
				++b;
		
		int ans =b;
		for(int i=0,j=c;j<n;++i,++j)
		{
			if(arr[i]>k)
				--b;
			
			if(arr[j]>k)
				++b;
			
			ans = Math.min(ans,b);
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,3,4,18,6,17,16,7,8,14,10,12};
		int n =arr.length;
		int k=12;
		System.out.println(minSwap(arr,n,k)+ "\n");
	}
}