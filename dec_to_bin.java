import java.util.Scanner;

public class  dec_to_bin
{

    public static void main(String args[])
    {
        Conversion();
    }

    public static void Conversion()
    {
        int n, b = 0, c = 0, d;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        n = input.nextInt();
        while (n != 0) {
            d = n % 2;
            b = b + d * (int) Math.pow(10, c++);
            n /= 2;
        } 
        System.out.println("Binary number: " + b);
        input.close();
    }
}