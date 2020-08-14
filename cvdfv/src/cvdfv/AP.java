package cvdfv;
import java.util.Scanner;
public class AP {
   
	private static Scanner s;

	public static void main(String[] args) {
     s = new Scanner(System.in);
     int x=s.nextInt();
     int i=1;
   
	   for(i=5;i<=4*x+3;i=i+3)
   {    
//    	 if(i==5)System.out.print(i);
    	 if(i%4!=0)
    	 System.out.print(i+" ");
//        System.out.print(" "+b);
       
     }
	}

}
