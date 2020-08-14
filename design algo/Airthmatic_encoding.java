import java.util.*;


public class Airthmatic_encoding {

    public static String decode(double lowV, double range_from, double range_to){
        lowV = (lowV - range_from) / (range_to - range_from);

        return "GERMAN";
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String : \n");
        String str = scan.next();

        System.out.println("Enter the Available Probabilities : \n");

        int n = scan.nextInt();

        char a[]  = new char[n];
        double prob[] = new double[n];
        int i;
        for(i = 0; i<n; i++){
            a[i] = scan.next().charAt(0);
            prob[i] = scan.nextDouble();
        }


        double lowV = 0.0;
        double highV = 1.0;
        double Diff = 1.0;

        double range_from = 0.0, range_to = 0.0;
        for(i =0; i< str.length(); i++){
            char code = str.charAt(i);
            range_from = 0.0;
            for(int j =0; j<n; j++){
                if(a[j] == code){
                    range_to = range_from + prob[j];
                    break;
                }else{
                    range_from += prob[j];
                }
            }

            highV = lowV + Diff*range_to;
            lowV  = lowV + Diff*range_from;
            Diff = highV-lowV;
        }
        System.out.println(lowV);

       System.out.println( decode(lowV, range_from, range_to));

    }
}