package june;

public class sumarray2 {
public static int[] sum(int arr1[],int arr2[])
{    int size=0;int min=0;
	int m=arr1.length;
	int n=arr2.length;
	
	if(m>n)
		{size=m+1;
	   min=n;
		}
	if(n>m)
	{
		size=n+1;
		min=m;
	}
	int i=m-1;
	int j=n-1;
	int sum=0;
	int k= size-1;
	int s[]=new int[size];
	int carry=0;
	while(i>=0&&j>=0)
	{
		sum=arr1[i]+arr2[j]+carry;
		i--;
		j--;
		s[k]=sum%10;
		sum=sum/10;
		carry=sum%10;
		k--;
	}
	while(i>=0)
	{
		sum=arr1[i]+carry;
		
		s[k]=sum%10;
		sum=sum/10;
		carry=sum%10;
		i--;
	}
	while(j>=0)
	{
		sum=arr2[j]+carry;
		
		s[k]=sum%10;
		sum=sum/10;
		carry=sum%10;
		j--;
	}
	  s[0]=carry; 
	return s;
}

public static void main(String args[])
{
	int arr1[]= {9,9,9,9};
	int arr2[]= {1,};
int arr[]=	sum(arr1,arr2);
for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
}
}
