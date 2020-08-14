import java.util.*;

public class sum_givenrange {

	public static int [] generatesegtree(int arr[])
	{
		int n=arr.length;
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
		  
        //Maximum size of segment tree 
        int size = 2 * (int) Math.pow(2, x) - 1; 
        int segtree[]=new int[size];
        generatehelper(segtree,arr,0,arr.length-1,0);
        return segtree;
	}
	public static void generatehelper(int segtree[],int arr[],int left,int right,int pos)
	{
		if(left==right)
		{
			segtree[pos]=arr[left];
			return ;
		}
		int mid=(left+right)/2;
		generatehelper(segtree,arr,left,mid,2*pos+1);
		generatehelper(segtree,arr,mid+1,right,2*pos+2);
		segtree[pos]=segtree[2*pos+1]+segtree[2*pos+2];
		
	}
	private void updateSegmentTreeRangeLazy(int segmentTree[],int lazy[], int startRange, int endRange,int delta, int low, int high, int pos) {
        if(low > high) {
              return;
              }

//make sure all propagation is done at pos. If not update tree
//at pos and mark its children for lazy propagation.
           if (lazy[pos] != 0) {
              segmentTree[pos] += lazy[pos];
            if (low != high) { //not a leaf node
              lazy[2 * pos + 1] += lazy[pos];
            lazy[2 * pos + 2] += lazy[pos];
                           } 
                 lazy[pos] = 0;
                 }

//no overlap condition
              if(startRange > high || endRange < low) {
               return;
               }

//total overlap condition
            if(startRange <= low && endRange >= high) {
               segmentTree[pos] += delta; 
                if(low != high) {
                 lazy[2*pos + 1] += delta;
                  lazy[2*pos + 2] += delta;
                  }
                return;
              }

//otherwise partial overlap so look both left and right.
              int mid = (low + high)/2;
              updateSegmentTreeRangeLazy(segmentTree, lazy, startRange, endRange,delta, low, mid, 2*pos+1);
              updateSegmentTreeRangeLazy(segmentTree, lazy, startRange, endRange,delta, mid+1, high, 2*pos+2);
             segmentTree[pos] = Math.min(segmentTree[2*pos + 1], segmentTree[2*pos + 2]);
}
	private int rangeMinimumQueryLazy(int segmentTree[], int lazy[], int qlow, int qhigh,int low, int high, int pos) {

              if(low > high) {
              return 0;
                    }

//make sure all propagation is done at pos. If not update tree
//at pos and mark its children for lazy propagation.
              if (lazy[pos] != 0) {
                  segmentTree[pos] += lazy[pos];
                    if (low != high) { //not a leaf node
                  lazy[2 * pos + 1] += lazy[pos];
                   lazy[2 * pos + 2] += lazy[pos];
                                   }
                        lazy[pos] = 0;
                               }

//no overlap
              if(qlow > high || qhigh < low){
               return 0;
                     }

//total overlap
               if(qlow <= low && qhigh >= high){
                    return segmentTree[pos];
                    }

//partial overlap
                 int mid = (low+high)/2;
                return (rangeMinimumQueryLazy(segmentTree, lazy, qlow, qhigh,low, mid, 2 * pos + 1)+
                  rangeMinimumQueryLazy(segmentTree, lazy,  qlow, qhigh,mid + 1, high, 2 * pos + 2));

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum_givenrange st=new sum_givenrange();
        Scanner s=new Scanner(System.in);
        int arr[]={0,3,4,2,1,6,-1};
        int segTree[]=generatesegtree(arr);
        int lazy[]=new int[segTree.length];
        st.updateSegmentTreeRangeLazy(segTree,lazy,0,1,1,0,arr.length-1,0);
        st.updateSegmentTreeRangeLazy(segTree,lazy,0,1,2,0,arr.length-1,0);
       int ans= st.rangeMinimumQueryLazy(segTree,lazy,0,1,0,arr.length-1,0);
       System.out.print(ans);
	}

}
