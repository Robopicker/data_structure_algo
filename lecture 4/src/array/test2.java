package array;
import java.util.Scanner;
public class test2 {
  private static Scanner s; 
	public static void main(String[] args) {
	    s=new Scanner(System.in);
		int number = s.nextInt(), originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("true");
        else
            System.out.println("false");
    }
// TODO Auto-generated method stub

	}


