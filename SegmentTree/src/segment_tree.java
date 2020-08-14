import java.util.*;
public class segment_tree {

	public static void function(int arr[],int n,int qleft,int qright)
	{
		 int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
		  
	        //Maximum size of segment tree 
	        int size = 2 * (int) Math.pow(2, x) - 1; 
		int tree[]=new int[size];
		construct_tree(tree,arr,0,n-1,0);
		int ans=queryrange(tree,qleft,qright,0,n-1,0);
		System.out.println(ans);
	}
	public static int  queryrange(int tree[],int qleft,int qright,int left,int right,int pos)
	{   //total overlap 
		if(qleft<=left&&qright>=right)
		{
			return tree[pos];
		}
		//no overlap
		if(qright<left||qleft>right)return Integer.MAX_VALUE;
		//partial overlap
		int mid=(left+right)/2;
		return Math.min(queryrange(tree,qleft,qright,left,mid,2*pos+1), queryrange(tree,qleft,qright,mid+1,right,2*pos+2));
		
	}
	public static void printsegment_tree(int tree[])
	{
		for(int i=0;i<tree.length;i++)
		{
			System.out.print(tree[i]+" ");
		}
	}
	public static  void construct_tree(int tree[],int arr[],int low,int high,int pos)
	{
		if(low==high)
		{
			tree[pos]=arr[low];
			return ;
		}
		int mid=(low+high)/2;
		construct_tree(tree,arr,low,mid,2*pos+1);
		construct_tree(tree,arr,mid+1,high,2*pos+2);
		tree[pos]=Math.min(tree[pos*2+1],tree[pos*2+2]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   arr[i]=s.nextInt();
       }
	  int t=s.nextInt();
        while(t-->0)
        {
         System.out.println("enter your query range");
         int qleft=s.nextInt();
         int qright=s.nextInt();
         function(arr,n,qleft,qright);
        }         
	}

}
