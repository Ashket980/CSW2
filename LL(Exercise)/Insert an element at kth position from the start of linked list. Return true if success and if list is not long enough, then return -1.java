
import java.util.Scanner;

class N
{
	int info;
	N link;
}

public class CH_6_EX_Q1
{
	static N start=null;
	static N last=null;
	static int c=0;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		
		N n=new N();
		System.out.println("Enter the info of first node:");
		n.info=sc.nextInt();
		n.link=null;
		
		start=last=n;
		
		System.out.println("Do you want to add more nodes?(y/n)");
		char c=sc.next().charAt(0);
		
		while(c=='y'||c=='Y')
		{
			n=new N();
			System.out.println("Enter the info:");
			n.info=sc.nextInt();
			last.link=n;
			
			last=n;
			
			System.out.println("Do you want to add more nodes?(y/n)");
			c=sc.next().charAt(0);
		}
	}
	
	public static void insert_at_kth_position_from_start(int data,int k)
	{
		N t=start;
		int p=1;
		
		if(k<=c)
		{
			while(t!=null && p<k-1)
			{
				t=t.link;
				p++;
			}
			
			N n=new N();
			n.info=data;
			n.link=t.link;
			t.link=n;
			
			display();
		}
		
		else
		{
			System.out.println("-1");
		}
	}
	
	public static void display()
	{
		N t=start;
		
		if(t==null)
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			while(t!=null)
			{
				System.out.print(t.info+" -> ");
				t=t.link;
			}
		}
	}
	
	public static int count()
	{
		N t=start;
		
		if(t==null)
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			while(t!=null)
			{
				t=t.link;
				c++;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) 
	{
		create();
		display();
		System.out.println(count());
		
		System.out.println();
	
		insert_at_kth_position_from_start(100,3);
//		insert_at_kth_position(100,9);
	}
}
