
public class Rotate 
{
	void rotate(int arr[],int d, int n)
		{
			for (int i=0;i<d;i++)
				rotate1(arr,n);
		}
	void rotate1(int arr[],int n)
	{
		int i, temp;
		temp = arr[0];
		for(i=0;i<n-1;i++)
			arr[i]=arr[i+1];
		arr[n-1]=temp;
	}
	void print (int arr[],int n)
	{
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+ "  ");
	}

	public static void main(String[] args) 
	{
		Rotate rotate2 =new Rotate();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		rotate2.rotate(arr, 2, 9);
		rotate2.print(arr, 9);
	}

}
