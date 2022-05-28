public class GCD 
{

    public static void main(String[] args) 
    {
        int m = 360, n = 60;
        int ans = gcd(m, n);

        System.out.printf("G.C.D of %d and %d is %d.", m, n, ans);
    }

    public static int gcd(int m, int n)
    {
        if (n != 0)
            return gcd(n, m % n);
        else
            return m;
    }
}