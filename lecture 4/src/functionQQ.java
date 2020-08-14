import java.util.Scanner;
public class functionQQ {
private static int largest(int input[])
{   int x=0;
	for(int i=0;i<input.length;i++)
	   {
		   if(input[i]<input[i+1])
		   {
			  x=input[i+1];
	           input[i]=input[i+1];		   
		   }
	   }
return x;
}
   
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
   int n=s.nextInt();
   int p=0;
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=s.nextInt(); 
   }
   System.out.println(arr[n-1]);
    p=largest(arr);
 
    System.out.println(p);
	}

}
