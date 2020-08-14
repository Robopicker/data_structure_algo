import java.util.*;
public class alive_probability {

	public static double function(int start,int end,int n,int step)
	{
		
		if(step==0)
		{
			return 1.0;
		}
		double p=0.0;
		if(end>=0)
		 p+=0.25*function(start,end-1,n,step-1);
		if(end<n)
		p+=0.25*function(start,end+1,n,step-1);
		if(start>=0)
			p+=0.25*function(start-1,end,n,step-1);
		if(start<n)
		p+=0.25*function(start+1,end,n,step-1);
		return p; 
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		double ans=function(start,end,n,step);
        System.out.println(ans);
	}

}
