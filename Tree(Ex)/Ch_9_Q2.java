
public class CH_9_EX_Q2
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
		start=new bt(6);
		bt a=new bt(4);
		bt b=new bt(8);
		bt c=new bt(2);
		bt d=new bt(5);
		bt e=new bt(7);
		bt f=new bt(9);
		bt g=new bt(1);
		bt h=new bt(3);
		last=new bt(10);
		
		start.Llink=a;
		start.Rlink=b;
		a.Llink=c;
		a.Rlink=d;
		b.Llink=e;
		b.Rlink=f;
		c.Llink=g;
		c.Rlink=h;
		f.Rlink=last;
		
		System.out.println("Inorder: ");
		in_order(start);
		System.out.println();
		System.out.println("PreOrder: ");
		post_order(start);

}
	public static void post_order(bt root)
	{
		if(root!=null)
		{
			post_order(root.Llink);
			post_order(root.Rlink);
			System.out.print(root.info+" ");
		}		
	}
	
	public static void in_order(bt root)
	{
		if(root!=null)
		{
			in_order(root.Llink);
			System.out.print(root.info+" ");
			in_order(root.Rlink);
		}		
	}
}
