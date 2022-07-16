import java.util.ArrayDeque;

public class Tree_bfs
{
	static class bt
	{
		int info;
		bt Llink;
		bt Rlink;
		
		bt(int info)
		{
			this.info=info;
			this.Llink=null;
			this.Rlink=null;
		}
	}
	
	static bt start=null;
	static bt last=null;
	
	public static void main(String[] args) 
	{
		start=new bt(5);
		bt a=new bt(7);
		bt b=new bt(9);
		bt c=new bt(6);
		bt d=new bt(2);
		bt e=new bt(18);
		last=new bt(4);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=last;
		
		System.out.println(bfs(start));

	}
	
	public static int bfs(bt root)
	{
		ArrayDeque<bt> a=new ArrayDeque<bt>();
		
		int c=0;
		
		bt temp;
		
		if(root!=null)
		{
			a.add(root);
			c++;
		}
			
		while(!a.isEmpty())
		{
			temp=a.remove();
			System.out.print(temp.info+" ");
			
			if (temp.Llink != null)
			{
				c++;
				a.add(temp.Llink);
			}
			
			if (temp.Rlink != null)
			{
				c++;
				a.add(temp.Rlink);
			}
		}
		
		System.out.println();
		return c;
	}
	

}
