package cvdfv;
import java.util.Scanner;
public class sumandproduct {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int N=s.nextInt();
		int C=s.nextInt();
		int i=0,sum=0,product=1;
	if(C==1)	
		{for(i=0;i<=N;i++)
		{
			sum=sum+i;
//			product=product*i;
		}
		System.out.print(sum);
		}
		int j=N;
		if(C==2) {while(j>=1) {
			product=product*j;
			j=j-1;
		}
//		System.out.println(sum);
		System.out.println(product);}
		if(C!=1&&C!=2) 
			System.out.println("-1");

	}

}
