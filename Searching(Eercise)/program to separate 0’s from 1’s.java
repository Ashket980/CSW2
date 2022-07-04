public class Q4_ 
{
    void segregate0and1(int arr[], int size) 
    {
        int left = 0, right = size - 1;
  
        while (left < right) 
        {
            while (arr[left] == 0 && left < right)
               left++;
  
            while (arr[right] == 1 && left < right)
                right--;
  
            if (left < right) 
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
      
    public static void main(String[] args) 
    {
        Q4_ seg = new Q4_();
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int i, arr_size = arr.length;
  
        seg.segregate0and1(arr, arr_size);
  
        System.out.print("Array after segregation is ");
        for (i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
    }
}
