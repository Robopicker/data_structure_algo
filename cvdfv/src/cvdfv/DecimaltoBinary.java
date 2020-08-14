package cvdfv;
import java.util.Scanner;

public class DecimaltoBinary {
    private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		int x=s.nextInt();
		int i=0;
		int X=0;
//		int count=0;
		while(x!=0)
		{
			int p=x%2;
			x=x/2;
		if(p==0)
			{
			   p=1;
			   
			}
		else p=x%2;
		    System.out.print(p);
//			count++;
		}
//		for( i=count;i>0;i--)
//		{
//			System.out.print(X);
//		}

	}

}
