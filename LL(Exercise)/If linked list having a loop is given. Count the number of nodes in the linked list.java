
public class CH_6_EX_Q6
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
		n sixth=new n(20);
		
		start.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		fifth.link=sixth;
		sixth.link=third;
		
		remove();
		System.out.println(count());
	}
	
	public static void remove()
	{
		n t=start;
	
		if(t==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			n slow=start;
			n fast=start;
			
			while(fast!=null && fast.link!=null)
			{
				slow=slow.link;
				fast=fast.link.link;
				
				if(slow==fast)
				{
					fast.link.link=null;
				}
			}
		}
	}
		
		public static int count()
		{
			n p=start;
			
			if(p==null)
			{
				System.out.println("List is empty");
			}
			
			else
			{
				while(p!=null)
				{
					p=p.link;
					c++;
				}
			}
			
			return c;
		}
	
}
