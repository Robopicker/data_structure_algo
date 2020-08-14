package cvdfv;
import java.util.Scanner;
class arrowpattern2
{
 private static Scanner s;

public static void main(String arg[])
 { 
	s = new Scanner(System.in);
    int N=s.nextInt(); 
 int i;
  int j;
  for( i=0;i<=N;i++)
   {
    for(j=0;j<=i;j++)
     {
      System.out.print(' ');
     }
    
     for(int k=0;k<=i;k++)
     System.out.print("*");
     System.out.print("\n");
   }
   for( i=0;i<=N-1;i++)
   {
    for(j=N-1;j>=i;j--)
     {
      System.out.print(' ');
     }
    
     for(int k=N-1;k>=i;k--)
     System.out.print("*");
     System.out.print("\n");
   }
 }

}