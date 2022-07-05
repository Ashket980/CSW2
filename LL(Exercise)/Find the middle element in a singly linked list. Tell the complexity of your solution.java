
public class CH_6_EX_Q9 
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

		middle();
	}
	
	public static int count()
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
				t=t.link;
				c++;
			}
		}
		
		return c;
	}
	
	public static void middle()
	{
		n t=start;
		
		int q=0;
		
		if(t==null) 
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t!=null && q<=c/2+1)
			{
				t=t.link;
				q++;
			}
			
			System.out.println("Middle element= "+t.info);
		}
	}
	
}
