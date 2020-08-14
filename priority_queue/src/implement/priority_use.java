package implement;

public class priority_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        priority_queue p=new priority_queue();
         p.insert(100);
         p.insert(10);
         p.insert(15);
         p.insert(4);
         p.insert(17);
         p.insert(21);
         p.insert(67);
         System.out.println(p.size());
         while(!p.isEmpty())
         {
        	 System.out.print(p.remove()+" ");
         }
         
	}

}
