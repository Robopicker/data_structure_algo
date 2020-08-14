package cvdfv;
import java.util.Scanner;

class pp 
{
 private static Scanner s;
 static int findTrailingZeros(int n)
 {
     int count = 0;
     for (int i=5; n/i>=1; i *= 5)
         count += n/i;

     return count;
 }
  
 public static void main (String[] args) 
 {
     s = new Scanner(System.in);
     int N=s.nextInt();
     System.out.println( findTrailingZeros(N));
 }
}