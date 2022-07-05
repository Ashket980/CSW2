
public class CH_6_EX_Q10
{
	static class n
	{
		int info;
		n link;
		
		n(int info)
		{
			this.info=info;
			this.link=null;
		}
	}
	
	static n start=null;
	static int c=0;
		
	public static void main(String[] args)
	{
		start=new n(10);
		n second=new n(12);
		n third=new n(14);
		n fourth=new n(16);
		n fifth=new n(18);
		
		start.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		
		reverse();
		display();
	}
	
	public static void reverse() 
	{
		n t=start;
		n prev = null;
		n next = null;
		 
		while (t!=null) 
		{
			next = t.link;
			t.link=prev;
			prev=t;
		    t=next;
		}
		start = prev;
	}
	
	public static void display()
	{
		n t=start;
		
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
}
