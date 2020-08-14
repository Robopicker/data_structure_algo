package cvdfv;
import java.util.Scanner;

public class sequence {
  private static Scanner s; 
	public static void main(String[] args) {
		s=new Scanner(System.in);// TODO Auto-generated method stub
         int N=s.nextInt();
         int i=0;
         int x[] =new int[N+1];
         while( i<N)
         {
        	 x[i]=s.nextInt();
        	 i++;
         }
//         for( i=0;i<N;i++)
//          {
//        	 if(x[i]!=x[N-i])
//        	 {   
//        		 System.out.print(x[i]);
//      
//        	   }
//        	 System.out.print(x[i]);
            }
//        System.out.print("true");
	 }

}
