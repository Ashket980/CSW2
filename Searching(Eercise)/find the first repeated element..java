
import java.util.HashSet;

public class Q1 
{
	public static void main(String[] args)
	{
		int a[]= {2,3,5,3,8,2,3,1,5,5,5};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!h.contains(a[i]))
			{
				h.add(a[i]);
			}
			
			else
			{
				System.out.println(a[i]);
				break;
			}
		}

	}

}
