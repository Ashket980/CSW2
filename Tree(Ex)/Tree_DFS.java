import java.util.Stack;

public class Tree_dfs 
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
		
		dfs(start);

	}	
	
	public static void dfs(bt root)
	{
		Stack<bt> a=new Stack<bt>();
		
		bt temp;
		
		if(root!=null)
		{
			a.add(root);
		}
			
		while(!a.isEmpty())
		{
			temp=a.pop();
			System.out.print(temp.info+" ");
			
			if (temp.Rlink != null)
			{
				a.add(temp.Rlink);
			}
			
			if (temp.Llink != null)
			{
				a.add(temp.Llink);
			}
		}
	}

	}


