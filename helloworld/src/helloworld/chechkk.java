package helloworld;
import java.util.Scanner;
public class chechkk {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
	 String  X =s.next() ;
      
	  int A=s.nextInt();int B=s.nextInt();int C=s.nextInt();
	  int avg=0;
	  int sum=0;
	  if(A>B&&A>C) {
		     sum=A;
		     if(B>C) sum=sum+B;
		     else sum=sum+C;}
	  else if(B>A&&B>C) {
		  sum=B;
		  if(A>C)sum =sum+A;
		  else sum=sum+C;
	  }
	  else {
		     sum=C;
		     if(B>A) sum=sum+B;
		     else
		    	 sum=sum+A;
	  }
	  avg=sum/2;
	  System.out.println(""+X);
	  System.out.println(avg);// TODO Auto-generated method stub
	}
}
