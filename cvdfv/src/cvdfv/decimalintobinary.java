package cvdfv;
import java.util.Scanner;
import java.util.ArrayList;
public class decimalintobinary {
private static Scanner s;

public static void main(String[] args) {
	s = new Scanner(System.in);
   int N=s.nextInt();
   ArrayList<Integer> arr=new ArrayList<Integer>();
   int count=0;
   while(N!=0)
   {   
       arr.add(N%2);
       count++; 
       N=N/2;
	     }
   for(int j=count;j>0;j--)
   {
	   System.out.print(arr.get(j));
//                     if(p==0)
//                    	 System.out.print("0");
//                 p=p/10;
//                	 System.out.print("0");
//       if(A!=0)System.out.print(A);}
   }

}
}
