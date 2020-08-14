package cvdfv;
import java.util.Scanner;
public class primenumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int N=s.nextInt();
		int i=2,flag=0;
		System.out.println(i);
		for(i=2;i<=N;i++)
		{   
			for(int j=2;j<i;j++)
			{ 
				if(i%j==0) {flag=0;break;}
			else { flag=1;}
			}
			if(flag==1) {
				System.out.println(i);
			}
			 }

	}
}





