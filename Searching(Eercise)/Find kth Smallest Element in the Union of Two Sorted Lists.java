
import java.util.HashSet;

public class Q10 
{
	public static void main(String[] args) 
	{
		int a[]= {1,5,2,8,3};
		
		int b[]= {8,5,9,4};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!h.contains(a[i]))
			{
				h.add(a[i]);
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(!h.contains(b[i]))
			{
				h.add(b[i]);
			}
		}
		
		System.out.println("Union= "+h);
		
		Object p[]=h.toArray();
		
		int k=6;
		
		System.out.println("Largest number= "+p[p.length-k]);

	}

}
