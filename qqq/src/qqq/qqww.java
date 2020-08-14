package qqq;
import java.util.Scanner;
public class qqww {
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
System.out.print(Math.round(root1));
//System.out.print(Math.round(root1));
System.out.print(Math.round(root2));
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
