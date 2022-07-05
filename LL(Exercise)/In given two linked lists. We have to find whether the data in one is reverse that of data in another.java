
public class CH_6_EX_Q8
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
	
	static n start1=null;
	static n start2=null;
	static n last1=null;
	static n last2=null;
		
	public static void main(String[] args)
	{
		start1=new n(10);
		n second=new n(12);
		n third=new n(14);
		n last1=new n(16);
				
		start1.link=second;
		second.link=third;
		third.link=last1;
		
		start2=new n(16);
		n fifth=new n(14);
		n sixth=new n(1);
		n last2=new n(10);
		
		start2.link=fifth;
		fifth.link=sixth;
		sixth.link=last2;
		
		reverse();		
		System.out.println(verify());
	}
	
	public static void reverse() 
	{
		n t=start2;
		n prev = null;
		n next = null;
		 
		while (t!=null) 
		{
			next = t.link;
			t.link=prev;
			prev=t;
		    t=next;
		}
		start2 = prev;
	}
	
	public static void display()
	{
		n t=start2;
		
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
	
	public static boolean verify()
	{
		n t=start1;
		n t1=start2;
		
		int f=0;
		
		while(t.link!=null)
		{
			t=t.link;
			t1=t1.link;
			
			if(t.info==t1.info)
			{
				f=1;
			}
			
			else
			{
				return false;
			}
		}
		
		if(last1==last2)
		{
			f=1;
		}
		
		if(f==1)
		{
			return true;
		}
		
		return false;
	}
}
