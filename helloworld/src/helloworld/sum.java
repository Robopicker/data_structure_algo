package helloworld;
import java.util.Scanner;
public class sum {

	private static Scanner s2;

	public static void main(String[] args) {
		s2 = new Scanner(System.in);
		int N=s2.nextInt();
		int i=1;
		int sum=0;
	  while(i<=N)
		{   
		    if(i%2==0)
		    {
		        sum =sum+i;
		    }
		  i=i+1;  
		}System.out.print(sum); 
// 		Read input as specified in the question.
// 	 	* Print output as specified in the question.
		

		
	}

}

