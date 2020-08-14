import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {

  ArrayList<Integer> list=new ArrayList<>(20);
  list.add(10);
  list.add(20);
  list.set(0, 30);
  System.out.println(list.get(0));
  list.remove(1);
  //System.out.println(list.iterator());
  
  
	}

}
