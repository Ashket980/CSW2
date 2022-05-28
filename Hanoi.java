import java.util.*;
import java.io.*;
import java.math.*;

public class Hanoi
{
	static void towerOfHanoi(int n, char a,
	                    char b, char c)
	{
	    if (n == 0)
	    {
	        return;
	    }
	    towerOfHanoi(n - 1, a, c, b);
	    System.out.println("Move disk "+ n + " from rod " + a +" to rod " + b);
	    towerOfHanoi(n - 1, c, b, a);
	}
	 
	public static void  main(String args[])
	{
	    int n = 4; 
	    towerOfHanoi(n, 'A', 'C', 'B'); 
	}
}