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

public class stones {
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
        
         
      Scanner s= new Scanner(System.in);
      int  t =s.nextInt();
     for(int k=0;k<t;k++)
      {     int count1=0;
      int loc1=0;
      int loc2=0;int count2=0;
    
          int size=s.nextInt();
          int array1[]=new int[size];int array2[]=new int[size];
          for(int i=0;i<size;i++)array1[i]=s.nextInt();
          for(int j=0;j<size;j++)array2[j]=s.nextInt();
         
         int max1=array1[0];int max2=array2[0];
           for(int i=0;i<size;i++)
           {    
              if(array1[i]>=max1)
              {
            	  max1=array1[i];
            	  loc1=i;
              }
           }
           for(int i=0;i<size;i++)
           {    
           if(array2[i]>max2)
           {
        	   max2=array2[i];
        	   loc2=i;
           }
           }
           if(loc2>loc1)System.out.println("Ankit");
           else if(loc2>loc1)System.out.println("Rupam");
           else System.out.println("Tie");
        
            
      }
          

    }
}
