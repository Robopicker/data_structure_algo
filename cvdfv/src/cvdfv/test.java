package cvdfv;
import java.util.Scanner;
public class test {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int N=s.nextInt();
	
		for(int i=0;i<N;i++)
		{  
			for(int j=1;j<2*N+1 ;j++)
			{
				if(j==N)
					{System.out.print("*");
					}
				if((j+i)%2==0)
		         System.out.print("*");
				else { System.out.print("0");
				           
				 }
				
			}
			System.out.println();
		}

	}

}
