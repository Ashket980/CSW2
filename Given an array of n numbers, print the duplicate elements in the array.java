import java.util.HashSet;

public class Q2
{
	public static void main(String[] args) 
	{
        int a[]= {1,7,4,2,7,1,8,9,1};
		
		HashSet<Integer> hs=new HashSet<Integer>();
				
		for(int i=0;i<a.length;i++)
		{
			if(!hs.contains(a[i]))
			{
				hs.add(a[i]);
			}
			
			else
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
