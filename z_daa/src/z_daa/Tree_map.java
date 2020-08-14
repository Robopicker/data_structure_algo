package z_daa;
import java.util.*;
public class Tree_map {

	public static void main(String[] args) {
	   TreeMap<Integer,Integer> arr=new TreeMap<>();
	   arr.put(34, 1);
	   arr.put(2, 1);
	   arr.put(4, 1);
	   for(int i: arr.keySet())
	   {
		   System.out.println(i);
	   }
	}

}
