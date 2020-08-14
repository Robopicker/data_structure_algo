package cvdfv;
import java.util.Scanner;
import java.math.BigInteger;
public class trailing {

	private static Scanner s;
	private static BigInteger A; 

	public static void main(String[] args) {
		  BigInteger F=new BigInteger("1");
//		   BigInteger A=new BigInteger("10");
	   BigInteger M=new BigInteger("0");
		s = new Scanner(System.in);
	   int N=s.nextInt();
	   int a=0;
	   F = new BigInteger(String.valueOf(N));	   
	 
	   int i=N;
   int count=0;
	   while(i>=1)
	   {
		   F=F.multiply(new BigInteger(Integer.toString(i)));
		   i=i-1;
	   }
	  System.out.print(F);
	   String str=F.toString();
	   while(str.length()!=0)
	   {   M=new BigInteger("F");  
		   M=M.mod(A);
		   
		   if(M==BigInteger.valueOf(a)) {
		      count=count+1;}
		   F= F.divide(A);
		   if(M!= BigInteger.valueOf(a))
		   {
			   System.out.print(count);
			   return;
		   }		   
	   }
   System.out.println(count);
	   
//	  System.out.print(F);
	   }
	}


