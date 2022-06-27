import java.util.HashSet;

public class Q3 
{
	public static void main(String[] args)
	{
		int a[] = { 1, 7, 4, 2, 7, 1, 8, 9, 1 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			hs.add(a[i]);
		}

		System.out.println(hs);
	}

}
