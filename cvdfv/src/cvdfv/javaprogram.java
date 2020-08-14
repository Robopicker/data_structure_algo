package cvdfv;
import java.util.Scanner;

public class javaprogram
{
    private static Scanner scan;

	public static void main(String args[])
    {
        int N, rev=0, rem;
        scan = new Scanner(System.in);
		
//        System.out.print("Enter a Number : ");
        N = scan.nextInt();
		
        while(N != 0)
        {
            rem = N%10;
            rev = rev*10 + rem;
            N = N/10;
        }
		
        System.out.print(rev);
    }
}