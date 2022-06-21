public class Q1 
{
	void seg(int arr[], int size)
	{
		int l = 0, r = size - 1;

		while (l < r)
		{
			while (arr[l] == 0 && l < r)
				l++;

			while (arr[r] == 1 && l < r)
				r--;

			if (l < r)
			{
				arr[l] = 0;
				arr[r] = 1;
				l++;
				r--;
			}
		}
	}

	public static void main(String[] args) 
	{
		Q1 seg = new Q1();
		int arr[] = new int[] { 0, 1, 1, 0, 0, 1, 1 };
		int i, arr_size = arr.length;

		seg.seg(arr, arr_size);

		System.out.print("Array after segregation is ");
		for (i = 0; i < arr_le; i++)
			System.out.print(arr[i] + " ");
	}
}
