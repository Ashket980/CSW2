
public class CH_6_EX_Q5
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
	static int c1=0;
	static int c2=0;
		
	public static void main(String[] args)
	{
		start1=new n(10);
		n second=new n(12);
		n third=new n(14);
		n fourth=new n(16);
		n fifth=new n(18);
		n sixth=new n(20);
		
		start1.link=second;
		second.link=third;
		third.link=fourth;
		fourth.link=fifth;
		fifth.link=sixth;
		sixth.link=null;
		
		start2=new n(22);
		n seventh=new n(24);
		
		start2.link=seventh;
		seventh.link=fourth;
		
		int x=length();
		int y=length2();
		
		System.out.println(x+" "+y);
		
		intersection(x,y);
	}
	
	public static int length()
	{
		n t1=start1;
		
		if(t1==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t1!=null)
			{
				t1=t1.link;
				c1++;
			}
		}
		return c1;
	}
	
	public static int length2()
	{
		n t2=start2;
		
		if(t2==null)
		{
			System.out.println("List is empty");
		}
		
		else
		{
			while(t2!=null)
			{
				t2=t2.link;
				c2++;
			}
		}
		
		return c2;
	}
	
	public static void intersection(int x,int y)
	{
		int p=Math.abs(x-y);
		
		int q=0;
		
		if(c1>c2)
		{
			n t1=start1;
			n t2=start2;
			
			while(q<p)
			{
				t1=t1.link;
				q++;
			}
			
			n a=t1;
			
			while(a!=null && t2!=null)
			{
				
				if(a.info==t2.info)
				{
					System.out.println("Intersection point= "+a.info);
					break;
				}
				

				a=a.link;
				t2=t2.link;
			}
		}
		
		else
		{
			n t1=start1;
			n t2=start2;
			
			while(t2!=null && q==p)
			{
				t2=t2.link;
				q++;
			}
			
			n b=t2;
			
			while(t1!=null && b!=null)
			{
				t1=t1.link;
				b=b.link;	
				
				if(t1.info==b.info)
				{
					System.out.println("Intersection point= "+b.info);
					break;
				}	
			}
		}
	}

}
