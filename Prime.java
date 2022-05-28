import java.util.*;

//public class Prime
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the no : ");
//        int n = sc.nextInt();
//        int i=1,c=0;
//        
//		for(i=1;i<=n;i++)	
//		{            
//			if(n%i==0)
//			{
//				c++;
//			}		      
//		}
//		
//		if(c==2)
//		{
//	 		System.out.println(n+" is a PRIME no");
//		}
//		else
//		{
//	 		System.out.println(n+" is a NOT a prime no");
//		}
//    }
//}

public class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if (isPrime(n))
		{
			System.out.println(n+ " is prime. ");
		}
		else 
		{
			System.out.println(n + " is not prime. ");
		}
	}
	public static boolean isPrime(int n)
	{
		if (n<=1)
		{
			return false;
		}
		for (int i=2;i<Math.sqrt(n);i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}













