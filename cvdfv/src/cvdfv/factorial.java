package cvdfv;
import java.util.Scanner;
public class factorial {

	private static Scanner s;

	public static void main(String[] args) {
	   s = new Scanner(System.in);
	   int N=s.nextInt();
	   int F=1,i=N;
	   while(i>=1)
	   {
		   F=F*i;
		   i=i-1;
	   }
	   System.out.print(F);

	}

}
