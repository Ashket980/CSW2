import java.util.*;
public class Reverse 
{

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
    	int  reverse = 0;  
    	
    	for( ;n != 0; n=n/10)   
    	{  
    		int remainder = n % 10;  
    		reverse = reverse * 10 + remainder;  
    	} 
    	
    	System.out.println("The reverse of the given number is: " + reverse);  
    }
}