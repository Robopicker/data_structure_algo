package june;
import java.util.*;


class Testwin {
    public static void main(String args[] ) throws Exception {
      
           Scanner s = new Scanner(System.in);
           int t=s.nextInt();
           for(int i=0;i<t;i++)
           {
               int size=s.nextInt();
               int d=s.nextInt();
               int alice[]=new int[size];
               int bob[]=new int[size];
                for(int j=0;j<size;j++)
                alice[i]=s.nextInt();
                for(int j=0;j<size;j++)
                bob[i]=s.nextInt();
                Arrays.sort(bob);
                int max=bob[size-1];
                int temp[]=new int[size];
                for(int j=0;j<size;j++)
                {
                	if(alice[j]<max)
                	{
                		temp[j]=max+1;
                	}
                	else {
                		temp[j]=alice[j];
                	}
                	
                }
              for(int j=0;j<size;j++)
            	  System.out.print(temp[i]+" ");
           }
        // Write your code here

    }
}
