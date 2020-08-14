package cvdfv;
import java.util.Scanner;
public class binaryintodecimal {
	  private static Scanner s;
	public static void main(String[] args) {
	  s=new Scanner(System.in);	 
      int N=s.nextInt();
//      int flag=0;
//      int count=0;
     while(N!=0) {
    	 int m=N%10;
    	 if(m==0) {int p=0;}
    	 N=N/10;
    	 
    	if(m!=0)System.out.print(m);
    	 
//   	 if(m==0||flag==0) { System.out.print("0");}
    	 }

	}
}
