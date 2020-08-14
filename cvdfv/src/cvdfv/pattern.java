package cvdfv;
import java.util.Scanner;
public class pattern {
private static Scanner patternnumber;

	public static void main(String[] args) {
      patternnumber = new Scanner(System.in);	   
 int N=patternnumber.nextInt();
 int count=1;
 int i=0;
 int c=0;
// int val=1;
	   for( i=1;i<=N/2;i++) {
	     for(count=0;count<i+2;count++)
	   {   
		   System.out.print("*");
		   System.out.print(" ");
				   }
	      System.out.print("\n");
}

		
	}

}

