import java.util.*;
public class Q3 {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
	        Stack<Integer> stk = new Stack<Integer>(); 
	        
	        System.out.println("Enter decimal number");
	        int num = sc.nextInt();
	 
	        while (num != 0)
	        {
	            int d = num % 2;
	            stk.push(d);
	            num /= 2;
	        }        
	        System.out.print("\nBinary equivalent = ");
	        while (!(stk.isEmpty() ))
	        {
	            System.out.print(stk.pop());
	        }
	        System.out.println();
	}

}
