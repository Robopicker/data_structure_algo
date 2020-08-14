import java.util.*;
public class Wine_DP {
public static int func(int arr[],int i,int j,int y )
{
	if(i>j)
	{
		return 0;
	}

	int a=Math.max(arr[i]*y+func(arr,i+1,j,y+1),arr[j]*y+func(arr,i,j-1,y+1));
	return a;
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,2,5,31,33,12,5,57,8,8,181,817,818};
		int n=arr.length;
		int y=1;
		int ans=func(arr,0,n-1,y);
		System.out.println(ans);
	}

}
