package helloworld;
import java.util.Scanner;
public class averagec {

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
	System.out.println(avg);
	
	}

}
