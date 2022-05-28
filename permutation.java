
public class permutation
{
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    private static void permutations(char[] a, int k)
    {
        if (k == a.length - 1) {
            System.out.println(String.valueOf(a));
        }
 
        for (int i = k; i < a.length; i++)
        {
            swap(a, k, i);
            permutations(a, k+ 1);
            swap(a, k, i);
        }
    }
 
    public static void findPermutations(String str) {

        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
 
    public static void main(String[] args)
    {
        String str = "123";
        findPermutations(str);
    }
}