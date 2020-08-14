/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=s.nextInt();
          int ans=0;
          for(int i=0;i<n;i++)
          {   int ans_so_far=0;
              int max_end_here=0;
              
              HashSet<Integer> map=new HashSet<>();
              for(int j=i;j<n;j++)
              {
                  if(map.contains(arr[j]))
                  {
                      break;
                  }
                  else
                   {map.add(arr[j]);
                   max_end_here=max_end_here+arr[j];
                    if(max_end_here<0)
                      max_end_here=0;
                      
                    if(max_end_here>ans_so_far)
                    {
                        ans_so_far=max_end_here;
                    }
                   
                   
                   }
              }
              if(ans_so_far>ans)
              {
                  ans=ans_so_far;
              }
          }
          System.out.println(ans);
          
      

    }
}
