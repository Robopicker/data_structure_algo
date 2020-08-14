package z_daa;

import java.util.*;
public class test_modelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total no. of entry");
		int N=s.nextInt();
		System.out.println("enter total no. of interval");
		int E=s.nextInt();
	float  expected =(float)N/E;
		int observed[]=new int[E];
		double semifinal[]=new double[E];
		double final1[]=new double[E];
		System.out.println("Expected value in each interval "+ expected);
		for(int i=0;i<E;i++)
		{
		    observed[i]=s.nextInt();
		}
		System.out.println("Interval"+" "+"observed" +"      "+"Expected"+"         "+"(O-E)                  (O-E)^2                 (O-E)^2/E" );
		for(int i=0;i<E;i++)
		{
			double ro=observed[i]-expected;
			 semifinal[i]=ro*ro;
			 final1[i]=(float)semifinal[i]/E;
			 
			 System.out.println(i+"        "+ observed[i]+"          "+expected+"        "+ro+"        "+semifinal[i]+"       "+final1[i] );
		}
float chi=0;
 for(int i=0;i<E;i++)
 {
	 chi+=final1[i];
 }
 System.out.println(" calculated chi value "+chi);
 System.out.println("Enter chi critical value");
		float temp=s.nextFloat();
		if(temp>chi)
		{
			System.out.println("null hypothesis accepted");
		}
		else
		{
			System.out.println("null hypothesis rejected");
		}
		

	}

}
