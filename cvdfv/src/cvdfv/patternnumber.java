package cvdfv;
import java.util.Scanner;
public class patternnumber {
  private static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int count=0;
		int val=0;
		for(i=0;i<n;i++)
		{   val=n-i;
			for(count=0;count<n;count++)
			{ 
				if(count==0||count<i)
					{System.out.print(val);
			        val=val+1;}
				else System.out.print(n);
			}
		System.out.println("");
		
		}

	}

	}
