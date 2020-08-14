package helloworld;
import java.util.Scanner;
public class roots {
 private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
int a = sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int Dsi =b*b-4*a*c;
if(Dsi>0) { System.out.println("1");
int root1=(int)(-b+Math.sqrt(Dsi))/(2*a);
if(root1<0) { root1=root1-1;}
int root2=(int)(-b-Math.sqrt(Dsi))/(2*a);
System.out.println(root1+" "+root2);
}
 if (Dsi<0) {
	System.out.println("-1");
}
 if(Dsi==0) {
	 System.out.println("0");
 }
}

}
