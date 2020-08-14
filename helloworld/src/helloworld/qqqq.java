package helloworld;

import java.util.Scanner;
public class qqqq {

	private static Scanner patternnumber;

	public static void main(String[] args) {
		patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   int val=0;
	   int i=0;
	   for( i=1;i<=N;i++) {
		   val=i;for(count=0;count<i;count++)
	   {     
		   System.out.print(val);
	        val=val+1;
		    }
	   System.out.print("\n");
}
	}

}