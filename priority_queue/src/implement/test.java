package implement;

public class test {

	static void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
  static  void upheapify(int arr[],int pos)
    {
        if(pos<=0)return ;
        int top=(int)Math.floor(pos/2);
        if(arr[top]<arr[pos])
        {
            swap(arr,top,pos);
            upheapify(arr,top);
        }
    }
    static void buildHeap(int arr[], int n)
    {
        for(int i=1;i<n;i++)
        {
            upheapify(arr,i);
        }
        printhelper(arr,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
   static void printhelper(int arr[],int pos)
    {
        if(pos<=0)return;
        swap(arr,0,pos);
        downheapify(arr,0,pos);
        printhelper(arr,pos-1);
        
    }
   static void downheapify(int arr[],int pos,int size)
    {
        int left=2*pos+1;
        int right=2*pos+2;
        int nextlargest=pos;
        if(left<size&&arr[left]>arr[pos])
        {
            nextlargest=left;
        }
        else if(right<size&&arr[right]>arr[pos])
        {
            nextlargest=right;
        }
        if(nextlargest!=pos)
        {
         swap(arr,pos,nextlargest);
         downheapify(arr,nextlargest,size);
            
        }
    }
	public static void main( String[] args)
	{
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		buildHeap(arr,arr.length);
		
	}
}
