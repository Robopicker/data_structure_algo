package helloworld;
import java.util.Scanner;
public class digit {
private static Scanner s;

public static void main(String []args)
{
	s = new Scanner(System.in);
	int N=s.nextInt();
  int m=N;
  int sum1=0;
  int sum2=0;
	while(m>0)
	{
		int a=m%10;
		if(a%2==0)sum1=sum1+a;
		if(a%2!=0)sum2=sum2+a;
		m=m/10;
		
	}
	System.out.println(sum1+" "+sum2);
}
}
