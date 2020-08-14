package june;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class food {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
       Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
       int q=s.nextInt();
       for(int i=0;i<q;i++)
       {   int temp=s.nextInt();
              if(temp==1)
              {
                  Integer t=stack.peek();
                  if(t==-1)System.out.println("NO FOOD");
                  else {
                	  System.out.println(t);
                	  stack.pop();
                   }
                  }
              
             if(temp==2)
             {
                 int cost=s.nextInt();
                 stack.push(cost);
             }
       }
       }
       
        // Write your code here

    }

