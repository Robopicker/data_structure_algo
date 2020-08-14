average 1;
import java.util.Scanner;
public class Solution {
private static Scanner s;

	public static void main(String[] args) {
		 
s = new Scanner(System.in);
  char c=s.next().charAt(0);
  int A=s.nextInt();
  int B=s.nextInt();
  int C=s.nextInt();
  int avg=0;
  avg=(A+B+C)/3;
  System.out.println(c);
	System.out.println(avg);//* Read input as specified in the question.
	 //	* Print output as specified in the question.
	//	*/

		
	}

}
charater caser;

import java.util.Scanner;
public class Main {

	private static Scanner dD;

	public static void main(String[] args) {
dD = new Scanner(System.in);
	char x=dD.next().charAt(0);
	if(x>='A'&&x<='Z')
	{
		System.out.println("1");
		
	}
	else if(x>='a'&&x<='z')
	{
		System.out.println("0");
	}
	else
		System.out.println("-1");
	
	

	}

}
  sum
import java.util.Scanner;
public class Solution {
      private static Scanner s;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		int sum=0;
		while(i<=N)
		{
		    if(i%2==0)
		    {
		        sum =sum+i;
		    }
		 i=i+1;   
		}System.out.println(sum); 
// 		Read input as specified in the question.
// 	 	* Print output as specified in the question.
		

		
	}

}
feranhittable;
import java.util.Scanner;
public class Solution {
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
   int i=S;
   while(i<=E)
       {  int C=(int)((5.0/9)*(i-32));
           System.out.println(i+" "+C);
           i=i+W;
	     
         }/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
pattern1;
import java.util.Scanner;
public class Solution {

private static Scanner patternnumber;
	public static void main(String[] args) {
				patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   int val=0;
	   int i=0;
	   for( i=1;i<=N;i++) {
		   val=i;for(count=0;count<i;count++)
	   {     
		   System.out.print(val);
	        val=val+1;
		    }
	   System.out.print("\n");
}/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
pattern2;
import java.util.Scanner;
public class Solution {
private static Scanner patternnumber;

	public static void main(String[] args) {
      patternnumber = new Scanner(System.in);	   
 int N=patternnumber.nextInt();
 int count=1;
 int i=0;
 int val=0;
	   for( i=1;i<=N;i++) {
		   val=i;
		   for(count=0;count<=N-1;count++)
	   {     
		   if(count<N-i)System.out.print(" ");
		   else {System.out.print(val);val=val+1;}
		    }
	   System.out.print("\n");
}

		
	}

}
star pattern;
import java.util.Scanner;
public class Solution {
private static Scanner patternnumber;

	public static void main(String[] args) {
      patternnumber = new Scanner(System.in);	   
 int N=patternnumber.nextInt();
 int count=1;
 int i=0;
 int val=0;
	   for( i=1;i<=N;i++) {
		   val=i;
		   for(count=0;count<=N-1;count++)
	   {     
		   if(count<N-i)System.out.print(" ");
		   else {System.out.print(val);val=val+1;}
		    }
	   System.out.print("\n");
}

		
	}

}
triangle pattern;
import java.util.Scanner;
public class Solution {
private static Scanner patternnumber;
	public static void main(String[] args) {
				patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=0;
	   int i=0;
	   int k=0;
	  for( i=1;i<=N;i++) {k=i;
		  for(count=1;count<N+N;count++)
	   {     
//		   if(count<N-i)System.out.print(" ");
//	   else {System.out.print(val);val=val+1;}
			  
		   if(count>N-i&&count<N+i) {System.out.print(k);
		   if(count<N)k=k+1;else k--;}
			   else {System.out.print(" ");}
		    }
	   System.out.print("\n");
}
	/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	}
}
find the average;

import java.util.Scanner;
public class Main {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
	 String  X =s.next();
     int A=s.nextInt();
      int B=s.nextInt();
      int C=s.nextInt();
	  int avg=0;
	  int sum=0;
	  if(A==B&&B==C){
        sum=A+B;
        avg=sum/2;
      }
      if(A>=B&&A>=C) {
		     sum=A;
		     if(B>C) sum=sum+B;
		     else sum=sum+C;}
	  else if(B>A&&B>C) {
		  sum=B;
		  if(A>C)sum =sum+A;
		  else sum=sum+C;
	  }
	  else {
		     sum=C;
		     if(B>A) sum=sum+B;
		     else
		    	 sum=sum+A;
	  }
	  avg=sum/2;
	  System.out.print(X+" "+avg);
	 // TODO Auto-generated method stub
	}
}

chahrter case;

import java.util.Scanner;
public class Main {

	private static Scanner dD;

	public static void main(String[] args) {
dD = new Scanner(System.in);
	char x=dD.next().charAt(0);
	if(x>='A'&&x<='Z')
	{
		System.out.println("1");
		
	}
	else if(x>='a'&&x<='z')
	{
		System.out.println("0");
	}
	else
		System.out.println("-1");
	
	

	}

}

totalsalary;
import java.util.Scanner;
public class Main {
	private static Scanner s;
	public static void main(String[] args) {
	s=new Scanner(System.in);// Write your code heres = new Scanner(System.in);
double hra,da,pf;int allow=0;
double totalsalary=0;
int basic=s.nextInt();
char grade=s.next().charAt(0);

if(grade=='A') {
allow=1700;}
else if(grade=='B') {
	allow=1500;
}
else
allow=1300;
hra=(basic*(20.0))/(100);
da=(basic*(50.0))/(100);
pf=(basic*(11.0))/(100);
totalsalary=((basic+hra+da+allow)-(pf));
System.out.println(Math.round(totalsalary));

	}
}
roots;
import java.util.Scanner;
public class Main {
 private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
int a = sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int Dsi =(int)(b*b-4*a*c);
  double root1=(-b+Math.sqrt(Dsi))/(2*a);
  double root2=(-b-Math.sqrt(Dsi))/(2*a);
if(Dsi>0) { System.out.println("1");
           System.out.print(Math.round(root1)+" "+Math.round(root2));
          // System.out.print(Math.round(root2));
}
 if (Dsi<0) {
	System.out.println("-1");
}
 if(Dsi==0) {
	 System.out.println("0");
   System.out.print(Math.round(root1)+" "+Math.round(root1));
   
 }
}

}
  evensumand odd;
import java.util.Scanner;
public class Main {
	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
	int N=s.nextInt();
  int m=N;
  int sum1=0;
  int sum2=0;
	while(m>0)
	{
		int a=m%10;
		if(a%2==0)sum1=sum1+a;
		if(a%2!=0)sum2=sum2+a;
		m=m/10;
		
	}
	System.out.println(sum1+" "+sum2);// Write your code here

	}
}
power;
import java.util.Scanner;
public class Main {
	private static Scanner s;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int i=0,n=1;
		for(i=0;i<y;i++) {
			n=x*n;
		}
		System.out.println(n);// Write your code here

	}
}
pattern1;
import java.util.Scanner;
public class Main {
  private static Scanner patternnumber;

	public static void main(String[] args) {
		
		patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   for(int i=0;i<=N;i++)
	   {
		   for(count=1;count<=i;count++)
		   {
			   System.out.print("1");
		   }
	    System.out.print("\n");
	   }

	// Write your code here

	}
}
pattern2;
import java.util.Scanner;
public class Main {
		private static Scanner patternnumber;

	public static void main(String[] args) {
		patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   for(int i=0;i<=N;i++)
	   {   for(count=1;count<=i;count++)
		   {
			 if(i==1)
			 {System.out.print("1");}
		if(i==2) {System.out.print("1");}
		 if(i>2) {
			if(count==1)
			  System.out.print(i-1);
		       if(count==i)System.out.print(i-1);   
		       if(count>1&&count<i) System.out.print("0");
		}
		}
		
	    System.out.print("\n");
	   }// Write your code here

	}
}

pattern3;
import java.util.Scanner;
public class Main {
	private static Scanner patternnumber;
	public static void main(String[] args) {
			patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   for(int i=0;i<=N;i++)
	   {   for(count=1;count<=i;count++)
		   {
			 if(i==1)
			 {System.out.print("1");}
		if(i==2) {System.out.print("1");}
		if(i>2) {
			if(count==1)
			  System.out.print(1);
		       if(count==i)System.out.print(1);   
		       if(count>1&&count<i) System.out.print("2");
		}
		}
		
	    System.out.print("\n");
	   }// Write your code here

	}
}
pattern4;
import java.util.Scanner;
public class Main {
	private static Scanner patternnumber;

	public static void main(String[] args) {

		patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
	   int val=1;
	   int i=0;
	   for( i=0;i<=N;i++) {
		   val=1;for(count=0;count<N-i;count++)
	   {   
		   System.out.print(val);
	        val=val+1;
	       
		    }
	   System.out.print("\n");
}// Write your code here

	}
}


