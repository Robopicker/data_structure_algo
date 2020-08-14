package cvdfv;
import java.util.Scanner;
public class qwwe {
	private static Scanner s;
  public static void celsius(int x,int y,int z) {
//		s = new Scanner(System.in);
		int S=x;
		int E=y;
		int W=z;
   int i=S;
   while(i<=E)
       {  int C=(int)((5.0/9)*(i-32));
           System.out.println(i+" "+C);
           i=i+W;
	     
         }
	  
  }
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		celsius(S,E,W);
//   int i=S;
//   while(i<=E)
//       {  int C=(int)((5.0/9)*(i-32));
//           System.out.println(i+" "+C);
//           i=i+W;
//	     
//         }
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
