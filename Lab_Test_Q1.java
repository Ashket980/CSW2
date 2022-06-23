import java.util.*;
 
public class Q1 {
    int findMaxSum(int arr[], int n)
    {
        int a = arr[0];
        int b = 0;
        int b_new;
        int i;
 
        for (i = 1; i < n; i++) {

            b_new = Math.max(a, b);
            a = b + arr[i];
            b = b_new;
        }
 

        return Math.max(a, b);
    }
 

    public static void main(String[] args)
    {
        Q1 sum = new Q1();
        int a[] = new int[] { 3,2,7,10 };
        int N = a.length;
 

        System.out.println(
            sum.findMaxSum(a, a.length));
    }
}

