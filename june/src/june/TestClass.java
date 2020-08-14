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

class TestClass {
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
       int n= s.nextInt();
       int count=0;
       int array[]=new int[n];
       int test[]=new int[n];
       for(int i=0;i<n;i++)array[i]=s.nextInt(); 
       for(int i=0;i<n;i++)test[i]=s.nextInt(); 
       for(int i=0;i<n;i++)
       {    if(array[i]==test[i])
           {
               count++;
           }
           
        else if(array[i]!=test[i])
           {  
            leftRotatebyOne(array,n); 
            count++;i--;
           }
          
       }
       
        // Write your code here
      System.out.println(count);
    }
   
 
    static void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
        
    }
}