import java.util.Scanner;

public class Q7
{
	public static int bs(int a[],int x)
	{
		int l=0,h=a.length-2;
		
		while(l<h)
		{
			int mid=(l+h)/2;
			
			if(a[mid]==x)
			{
				return mid;
			}
			
			else if(x<a[mid])
			{
				h=h-1;
			}
			
			else
			{
				l=l+1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];
		
		System.out.println("Enetr the elements: ");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int value=4;
		
		bs(a,value);
		
		if(bs(a,value)==-1)
		{
			System.out.println(value+" is not present");
			a[a.length-1]=value;
			
			for(int i=1;i<a.length;i++)
			{
				int key=a[i];
				int j=i-1;
				
				while(j>=0 && a[j]>key)
				{
					a[j+1]=a[j];
					j--;
				}
				
				a[j+1]=key;
			}
			
			for(int p:a)
			{
				System.out.print(p+" ");
			}
		}
		
		
	}
}
