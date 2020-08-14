package helloworld;
import java.util.Scanner;
public class salary {
private static Scanner s;

public static void main(String [] args)
{
s = new Scanner(System.in);
int hra,da,pf;int allow=0;
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
hra=(int)(basic*(0.2));
da=(int)(basic*(0.5));
pf=(int)(basic*(0.11));
totalsalary=((basic+hra+da+allow)-(pf));
System.out.println(totalsalary);

}
}