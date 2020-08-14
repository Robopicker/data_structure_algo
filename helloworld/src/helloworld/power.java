package helloworld;
import java.util.Scanner;
public class power {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int i=0,n=1;
		for(i=0;i<y;i++) {
			n=x*n;
		}
		System.out.println(n);

	}

}
