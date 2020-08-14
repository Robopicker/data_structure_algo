package huffman_coding;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
 import java.util.*;
class HuffmanNode {
 
    int data;
    char c;
 
    HuffmanNode left;
    HuffmanNode right;
}
 
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y)
    {
 
        return x.data - y.data;
    }
}
 
public class Huffman {
 
 
	static HashMap<Character ,String> map=new HashMap<>();
	static String encoded="";
    public static void printCode(HuffmanNode root, String s)
    {
 
        
        if (root.left== null&& root.right== null&& Character.isLetter(root.c)) {
 
            System.out.println(root.c + ":" + s);
             map.put(root.c,s);
             encoded+=s;
            return;
        }
 
       
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
 
     public static void decode(HuffmanNode root)
     {
    	 String ans="";
    	 HuffmanNode temp=root;
    	 for(int i=0;i<encoded.length();i++)
    	 {
    		 if(encoded.charAt(i)=='0')
    		 {
    			 temp=temp.left;
    		 }
    		 else temp=temp.right;
    		 if(temp.left==null&&temp.right==null)
    		 {
    			 ans+=temp.c;
    			 temp=root;
    		 }
    	 }
    	 System.out.println(ans);
     }
    public static void main(String[] args)
    {
 
        Scanner s = new Scanner(System.in);
 
       
        int n = 0;
        n=s.nextInt();
        
        char[] charArray = new char[n];
        
        int[] charfreq = new int[n]; 
      for(int i=0;i<n;i++)
      {
    	  charArray[i]=s.next().charAt(0);
      }
      for(int i=0;i<n;i++)
      {
    	  charfreq[i]=s.nextInt();
      }
         
        PriorityQueue<HuffmanNode> q
            = new PriorityQueue<HuffmanNode>(n, new MyComparator());
 
        for (int i = 0; i < n; i++) {
 
            HuffmanNode hn = new HuffmanNode();
 
            hn.c = charArray[i];
            hn.data = charfreq[i];
 
            hn.left = null;
            hn.right = null;
 
           
            q.add(hn);
        }
 
    
        HuffmanNode root = null;
 
        
        while (q.size() > 1) {
 
           
            HuffmanNode x = q.peek();
            q.poll();
 
           
            HuffmanNode y = q.peek();
            q.poll();
 
          
            HuffmanNode f = new HuffmanNode();
 
         
            f.data = x.data + y.data;
            f.c = '-';
 
         
            f.left = x;
 
           
            f.right = y;
 
           
            root = f;
 
            q.add(f);
        }
 
       
        printCode(root, "");
        decode(root);
        
        
    }
}