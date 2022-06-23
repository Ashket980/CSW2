import java.io.*;
import java.util.Arrays;

public class Q4 
{

	static int A1(int arr[], int l, int h, int t, int n) 
	{
		if (h >= l) 
		{
			int mid = l + (h - l) / 2;

			if ((mid == 0 || t > arr[mid - 1]) && arr[mid] == t)
				return mid;
			if (t > arr[mid])
				return A1(arr, (mid + 1), h, t, n);
			return A1(arr, l, (mid - 1), t, n);
		}
		return -1;
	}

	static void sortAccording(int arr1[], int arr2[], int m, int n) 
	{
		int t[] = new int[m], v[] = new int[m];
		for (int i = 0; i < m; i++) 
		{
			t[i] = arr1[i];
			v[i] = 0;
		}

		Arrays.sort(t);

		int ind = 0;

		for (int i = 0; i < n; i++) 
		{
			int f = A1(t, 0, m - 1, arr2[i], m);

			if (f == -1)
				continue;

			for (int j = f; (j < m && t[j] == arr2[i]); j++) 
			{
				arr1[ind++] = t[j];
				v[j] = 1;
			}
		}

		for (int i = 0; i < m; i++)
			if (v[i] == 0)
				arr1[ind++] = t[i];
	}

	static void print(int arr[], int n) 
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) 
	{
		int arr1[] = { 1, 2, 3, 4, 3, 2, 4, 2, 5 };
		int arr2[] = { 4, 2, 1, 3 };
		int m = arr1.length;
		int n = arr2.length;
		System.out.println("Sorted array is ");
		sortAccording(arr1, arr2, m, n);
		print(arr1, m);
	}
}
