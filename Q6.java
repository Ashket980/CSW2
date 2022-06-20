import java.util.*;

public class Q6 
{

	static int lel(int[] arr) 
	{
		int n = arr.length;

		if (n == 1)
			return arr[0];

		int l = -1, s = -1;

		for (int m : arr) 
		{

			if (m >= l) 
			{
				s = l;
				l = m;
			}

			else if (m >= s) 
			{
				s = m;
			}
		}

		return l - s;
	}

	public static void main(String[] args) 
	{

		int[] arr = { 7, 4, 1, 9, 6 };
		System.out.print(lel(arr));
	}
}