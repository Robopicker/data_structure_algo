package cvdfv;
import java.math.BigInteger;
import java.util.Scanner;
class biginteger2 {
private static Scanner input;
public static void main(String [] args) {
        input = new Scanner(System.in);
        int a = input.nextInt();
        fact(a);
    }
    private static void fact(int a) {
        BigInteger fact = new BigInteger("1");
        int i, count = 0;
        for (i = 1; i <= a; i++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        String str1 = fact.toString();
        for(int j = str1.length() - 1; j > -1; j--) {
            if(Character.digit(str1.charAt(j), 10) != 0) {
                System.out.println(count);
                break;
            } else {
                count++;
            }
        }
    }
}
