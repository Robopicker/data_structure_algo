package qqq;
import java.util.Scanner;
public class yyy {
	private static Scanner s;
	public static void main(String[] args) {
		new Scanner(System.in);// Write your code heres = new Scanner(System.in);
float hra,da,pf;int allow=0;
int  totalsalary=0;
int basic=s.nextInt();
char grade=s.next().charAt(0);

if(grade=='A') {
allow=1700;}
else if(grade=='B') {
	allow=1500;
}
else
allow=1300;
hra=(basic*(20))/(100);
da=(basic*(50))/(100);
pf=(basic*(11))/(100);
totalsalary=(int)((basic+hra+da+allow)-(pf));
System.out.println(totalsalary);

	}
}
