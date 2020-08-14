package cvdfv;
import java.util.Scanner;
public class arrowpattern {
  private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		int N=s.nextInt();
		int i=0,j=0;
		for(i=0;i<=N/2;i++)
		{
			for(j=1;j<=2*i+2;j++)
			{ 	int x=0;while(x<i){
				if(x%2!=0)System.out.print(" ");
				x=x+1;
				
			}
			if(j%2==0)
			  System.out.print("*");
//	    if(j%2!=0) System.out.print(" ");
		      	}
		     	System.out.println("");
		}

	}

}
