import java.util.Stack;

public class Q1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		int n=10;
		while(n>0)
		{
			int r=n%2;
			s.push(r);
			n/=2;
		}
		System.out.print("Binary =");
		while(!(s.isEmpty()))
		{
			System.out.print(s.pop());
		}
	}
}
