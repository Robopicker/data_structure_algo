package cvdfv;
import java.util.Scanner;
public class JJ {

private static Scanner s;
	public static void main(String[] args) {
      s=new Scanner(System.in);
      int i,j,N=s.nextInt();
      for(i=0;i<((N+1)/2);i++)
      {
        for(j=0;j<=i;j++)
        {
          System.out.print(" ");
        }
        for(j=0;j<i;j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
      for(i=0;i<((N+1)/2);i++)
      {
        for(j=1;j<(((N+1)/2)-i);j++)
        {
          System.out.print(" ");
        }
        for(j=0;j<(((N+1)/2)-i);j++)
        {
          System.out.print("* ");
        }
          System.out.println();
      }
     }
      
    }