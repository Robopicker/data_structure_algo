package cvdfv;
import java.util.Scanner;
public class copypaste
{
    private static Scanner s;
	public static void main(String[] args) 
    {
        int n;
        String x;
        s = new Scanner(System.in);
//        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        copypaste obj = new copypaste();
        x =obj.binary(n);
        System.out.println(x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}