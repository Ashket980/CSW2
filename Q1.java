import java.util.*;
public class Q1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		alist.add(6);
		alist.add(7);
		alist.add(8);
		
		System.out.println(alist);
		 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		if(alist.contains(n)) 
		{
			System.out.println("Element is present in the list. ");
		}
		else
		{
			System.out.println("Element is not present in the list. ");
		}
		System.out.println();
		System.out.print("Enter the position from where the element is to be removed = ");
		int key = sc.nextInt();
		alist.remove(key);
		
		System.out.println(alist);
		
		System.out.println("Checking if the list is empty or not.");
		
		boolean ans = alist.isEmpty();
		if (ans==true)
			System.out.println("list is empty.");
		else
			System.out.println("list is not empty");
		
	}
}