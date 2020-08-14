package hashmap;
import java.util.*;
public class Solution {
	/*important*/
	public static int maxdistance(int arr[])
	{   
		HashMap<Integer,Integer> map=new HashMap<>();
		int index=0;
		int maxdistance=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{    
			   map.put(arr[i],i);
			}
			else {
			maxdistance=Math.max(maxdistance,i-map.get(arr[i]));
			}
		}
		return maxdistance;
	}
	public static int freq(int arr[])
	{
		int max=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		 Set<Integer> s = map.keySet(); 
		for(int i:s)
		{
			if(max<map.get(i))
			{
				max=map.get(i);
			}
		}
		return max;
	}
	public static void print(int arr[])
	{
		HashSet<Integer> map=new HashSet<>();
		int p=0;
		 for(int i=0;i<arr.length;i++)
		 {   if(map.contains(arr[i]))
		    { p=1;
			 System.out.println(arr[i]);
		     }
		   map.add(arr[i]);
		   
			 
		 }
		 if(p==0)
		 {
			 System.out.println("-1");
		 }
	}
	public static Boolean maxk(int arr[],int k)
	{
		 HashMap<Integer, Integer> map = new HashMap<Integer, 
                 Integer>();
		 Boolean flag=true;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(!map.containsKey(arr[i]))
			 {
				 map.put(arr[i],i);
			 }
			 else {
				      int x=i-map.get(arr[i]);
				      if(x==k)
				      {
				    	  map.put(arr[i], i);
				      }
				      else {
				    	  flag=false;
				    	  continue;
				      }
			 }
		 }
		 if(flag==true)
		 {
			 return true;
		 }
		 else
		 return false;
	}
	 public static int delete2(int arr[], int n) 
	    {
	        // Insert all elements in hash. 
	       HashMap<Integer, Integer> hash = new HashMap<Integer, 
	                                           Integer>(); 
	         
	        for (int i=0; i<n; i++)
	            if(hash.containsKey(arr[i]))
	                hash.put(arr[i], hash.get(arr[i])+1);
	            else hash.put(arr[i], 1);
	         
	        // find the max frequency
	        int max_count = 0;
	        Set<Integer> s = hash.keySet(); 
	         
	        for (int i : s)
	            if (max_count < hash.get(i))
	                max_count = hash.get(i);
	      
	        // return result
	        return (n - max_count); 
	    }
	   
     public static int delete(int arr[])
     {    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       int max =Integer.MIN_VALUE;
    	for(int i:arr)
    	{
    		if(map.containsKey(i))
    		{
    			map.put(i, map.get(i)+1);
    		}
    		else {
    			map.put(i, 1);
    		}
    	}
    	
    	for(int i:map.values())
    	{
    		if(i>max)
    		{
    			max=i;
    		}
    	}
    	
    	return arr.length-max; 
     }
	
	public static Boolean subset(int[] arr1,int arr2[]){
		HashSet<Integer> map=new HashSet<Integer>();
		for(int i:arr1)
		{
			map.add(i);
		}
		for(int i:arr2)
		{
			if(map.contains(i))
			{
				continue;
			}
			else {
				return false;
			}
		}
		return false;
     
	}
	
	public static int firstktimes(int arr[],int k)
	{         int first=0;
		 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 HashMap<Integer,Integer> freq= new HashMap<>();
		 for(int i=0;i<arr.length;i++)
		 {
			 int key=arr[i];
			 if(map.containsKey(key))
			 {
			     freq.put(key, freq.get(key)+1);
			 }
			 else{ 
				 map.put(key,i);
				 freq.put(key,1);     
			 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 int key=arr[i];
			 if(freq.get(key)==k)
			 {
			  return arr[map.get(key)];
			 }
		 }
		
		return -1;
	}
	public static void arraypair(int arr[][])
	{
      HashSet<Integer> X=new HashSet<Integer>();
      HashSet<Integer> Y=new HashSet<Integer>();
     
      for(int i=0;i<arr.length;i++)
      {     
    	X.add(arr[i][0]);
    	Y.add(arr[i][1]);
      }
      for(int i=0;i<arr.length;i++)
      {
    	  if(Y.contains(arr[i][0])&&X.contains(arr[i][1])) 
    	  {
    		 System.out.println(arr[i][0]+" "+arr[i][1]); 
    		 X.remove(arr[i][0]);
    		 Y.remove(arr[i][1]);
    	  }
      }
	
	}
	
	  static int largest(int arr[])
	     {
	         int i;
	          
	         // Initialize maximum element
	         int max = arr[0];
	       
	         // Traverse array elements from second and
	         // compare every element with current max  
	         for (i = 1; i < arr.length; i++)
	             if (arr[i] > max)
	                 max = arr[i];
	       
	         return max;
	     }
	     public static int pairsum(int arr1[],int arr2[])
	     {   int sum=0;
	    	 HashSet<Integer> map=new HashSet<>();
	    	 for(int i=0;i<arr1.length;i++)
	    	 {
	    		 map.add(arr1[i]);
	    		 sum+=arr1[i];
	    	 }
	    	 for(int i=0;i<arr2.length;i++)
	    	 {
	    		 if(map.contains(arr2[i]))
	    		 {
	    			 sum=sum-arr2[i];
	    		 }else {
	    			 sum+=arr2[i];
	    		 }
	    			 
	    	 }
	    	 
	    	 return sum;
	     }
	
	     public static void printoccurence(int arr[])
	     {
	    	 Boolean visit[]=new Boolean[arr.length];
	    	 for(int i=0;i<arr.length;i++)
	    	 visit[i]=false;
	    	 for(int i=0;i<arr.length;i++)
	    	 {
	    		 if(!visit[i])
	    		 {
	    			 System.out.print(arr[i]);
	    			 for(int j=i+1;j<arr.length;j++)
	    			 {
	    				 if(arr[i]==arr[j])
	    				 {
	    					 System.out.print(arr[j]);
	    					 visit[j]=true;
	    				 }
	    			 }
	    		 }
	    	 }
	     }
	     public static Boolean equals(int arr1[],int arr2[])
	     {
	       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	      for(int i=0;i<arr1.length;i++)
	      {
	    	  if(map.containsKey(arr1[i]))
	    	  {
	    		  map.put(arr1[i], map.get(arr1[i])+1);
	    	  }else {
	    		  map.put(arr1[i],1);
	    	  }
	    	  
	      }
	      for(int i=0;i<arr2.length;i++)
	      {
	    	 if(!map.containsKey(arr2[i]))
	    	 {
	    		 return false;
	    	 }
	    	 if(map.get(arr2[i])==0)
	    	 {
	    		 return false;
	    	 }
	    	 int count=map.get(arr2[i]);
	    	 count--;
	    	 map.put(arr2[i], count);
	     }
	      for(int i=0;i<arr2.length;i++ )
	      {
	    	  if(map.get(arr2[i])>1)
	    	  {
	    		  return false;
	    	  }
	    	 
	    	  
	      }
	      return true;
	      
	     }
  public static void  pair(int arr[],int k)
  {
	  HashSet<Integer> map=new HashSet<>();
	  for(int i=0;i<arr.length;i++)
		 map.add(arr[i]);
	  for(int i=0;i<arr.length;i++)
	  {
		  int temp=k-arr[i];
		  if(temp>=0&&map.contains(temp))
		  {
			  System.out.println(arr[i]+" " +temp);
			  map.remove(arr[i]);
		  }
	  }
  }
  public static void range(int arr[],int low,int high)
  {
	  HashSet<Integer> map=new HashSet<>();
	
	  for(int i=0;i<arr.length;i++)
		  map.add(arr[i]);
	  for(int i=low;i<=high;i++)
	  {
		  if(!map.contains(i))
		  {
			  System.out.println(i+" ");
		  }
	  }
  }
  public static int largestproduct(int arr[])
  {
	  HashSet<Integer> map=new HashSet<>();
	  for(int i=0;i<arr.length;i++)
		  map.add(arr[i]);
	  for(int i=0;i<arr.length;i++)
	  {
		  int temp=arr[i];
		  int x=temp/10;
		  int y=arr[i]%10;
		  if(y==0)
		  {
			  y=y+1*10;
		  }
		  System.out.println(x+" "+y);
		  if(map.contains(x)&&map.contains(y))
		  {
			  return arr[i];
		  }
	  }
	  
	  return -1;
  }
  
  
  public static int[] rearrange(int[] array)
  {     Arrays.sort(array);
	  int []ans=new int[array.length];
	  int p=0,q=array.length-1;
	  int count=0;
	  for(int i=0;i<array.length;i++)
	  {
		  if(i%2==0)
		  {
			  ans[count++]=array[q];
			  q--;
		  }else if(i%2==1)
		  {
			  ans[count++]=array[p];
			  p++;
		  }
	  }
	 return ans;
  }
  
  private static void swap(int i, int j) {
	  int temp=i;
	  i=j;
	  j=temp;
	
}
public static void rearrange1(int array[])
  {   
      int i=-1;
      for(int j=0;j<array.length;j++)
      {
    	  if(array[j]<0)
    	  {
    		  i++;
    		  int temp=array[i];
    		  array[i]=array[j];
    		  array[j]=temp;
    	  }
      }
      int pos=i+1;
      int neg=0;
      while(pos<array.length&&neg<pos&&array[neg]<0)
      {
    	   int temp=array[pos];
    	   array[pos]=array[neg];
    	   array[neg]=temp;
    	   pos++;
    	   neg+=2;
    	   
      }
    
  }
public static int[] rearrange3(int[] arr)
{
	Arrays.sort(arr);
	int[] ans=new int[arr.length];
	int count=0;
	int p=0,q=arr.length-1;
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{
			ans[count++]=arr[p++];
		}
		else if(i%2==1)ans[count++]=arr[q--];
	}
	return ans;
}
  
  public static void move_zero(int []arr)
  {
	  int count=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]!=0)
		  {
			  arr[count++]=arr[i];
		  }
	  }
	  while(count<arr.length)
	  {
		  arr[count++]=0;
	  }
  }
  
  public static void move_zero1(int[] arr)
  {   int zero=0;
	  for(int j=0;j<arr.length;j++)
	  { 
	   if(arr[j]!=0)
	  {      
		  int temp=arr[j];
		  arr[j]=arr[zero];
		  arr[zero]=temp;
		  zero=zero+1;
	  }
		  
	  }  
  }
  public static void rearrange4(int []arr,int n)
  {   
   for(int i=0;i<n;i++)
   {
	   if(arr[i]==0)
	   {
		   continue;
	   }
	   else{
		    
		   if(arr[i+1]!=0&&(i+1)<n)
		   {   arr[i]=2*arr[i];
			   arr[i+1]=0;
		   }
		 }
   }
   move_zero1(arr);
	  
  }
  public static void rearrange5(int[] arr,int []index,int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  
		  while(index[i]!=i)
		  {
			  int oldi=index[index[i]];
			  char olde=(char)arr[index[i]];
			  
			  arr[index[i]] = arr[i];
              index[index[i]] = index[i];
    
              // Copy old target values to arr[i] and
              // index[i]
              index[i] = oldi;
              arr[i]   = olde;
		  }
	   }
  }
  public static void pos_neg(int arr[])
  {
	  int i=arr.length;
	  for(int j=0;j<arr.length;j++)
	  {
		  if(arr[j]<0)
		  {
			  i--; 
			  
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			 
		  }
	  }
  }
  
  public static void printlargest(Vector<String> ans)
  {
	  Collections.sort(ans,new Comparator<String>()
			  {
		       public int compare(String x,String y)
		       {
		    	   String xy=x+y;
		    	   String yx=y+x;
		    	   return xy.compareTo(yx)>0 ?-1 : 1;
		       }
			  });
	  Iterator it=ans.iterator();
	  while(it.hasNext())
	  {
		  System.out.print(it.next());
	  }
  }
  
  public static void rearrange6(int []arr)
  {
	  int []temp=new int[arr.length];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  temp[arr[i]]=i;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=temp[i];
	  }
  }
  public static void print1(int []arr)
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
  }
  public static void rearrange_1(int arr[],int n)
  {  
	  
	  int max=arr[n-1];
	  int min=arr[0];
	  int max1=n-1;
	  int min1=0;
	  for(int i=0;i<n;i++)
	  {
		  if(i%2==0)
		  {
			  arr[i]+=arr[max1]%max*max;
			  max1--;
		  }
		  else{
			 arr[i]+=arr[min1]%min*min;
			 min1++;
		  }
	  }
  }
  public static void rearrange7(int arr[],int n)
  {
     for(int i=0;i<n;i++)
      {     if(i+1>=n)break;
	     if(i%2==0)
       {   if(arr[i]<=arr[i+1])
          {
      	  continue;
           }
       else {
    	int temp=arr[i];
    	arr[i]=arr[i+1];
    	arr[i+1]=temp;
           }
       }
	  else {
		  if(arr[i]>=arr[i+1])
		  {
			  continue;
		  }
		  else {
			  int temp=arr[i];
		    	arr[i]=arr[i+1];
		    	arr[i+1]=temp;
		  }
		  
	  }
	      
      }
	  
  }
  public static void swap1(int x,int y)
  {
	  int temp=x;
	  x=y;
	  y=temp;
  }
  
  
  public static void print_subset(int arr[],int n)
  {  int count0=0;
  int count1=0;
	int length=0;
	int min_length=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==0)
		{
			count0++;
			
		}else if(arr[i]==1)
		{
			count1++;
		}
		
	}
  }
  
public static void rotate(int arr[],int k)
{
	 int count=0;
	 while(count<k)
	 {
		 int num=arr[arr.length-1];
		 int j;
		 for( j=arr.length-1;j>0;j--)
		 {    
			 arr[j]=arr[j-1];
		
		 }
		 arr[0]=num;
		 count++;
	 }
	
	
}
 
public static int sum(int arr[])
{   int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+i*arr[i];
	}
	return sum;
}
public static void sum_rotate(int arr[])
{
	int sum=0;
	
	int count=0;
	while(count<arr.length)
	{
	 rotate(arr,1);
	 int temp= sum(arr);
	 if(temp>sum)
	 {
		 sum=temp;
		 count++;
	 }
	 else if(temp<sum)
	 {
		 break;
	 }
	 
	}
	System.out.println(sum);
	System.out.print(count);
}

public static int min_element(int arr[],int low,int high)
{
	if(high<low)return arr[0];
	if(high==low)return arr[low];
	int mid=(low+high)/2;
	
	if(mid<high&&arr[mid]>arr[mid+1])
	{
		return arr[mid+1];
	}
	else if(mid>low&&arr[mid]<arr[mid-1])
	{
		return arr[mid-1];
	}else {
		     if(arr[high]>arr[mid])
		    	 return min_element(arr,mid+1,high);
		     else
		    	 return min_element(arr,low,mid-1);
	}
}

public static void hamming_distance(int arr[])
{    int hamming=0;
	int temp[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		temp[i]=arr[i];
	}
	int count=0;
	while(count<arr.length)
	{
		rotate(temp,1);
		int temp1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=temp[i])
			{
				temp1++;
			}
		}
		if(temp1>count)
		{
			count=temp1;
		}
		else {
			
			break;
		}
	}
	System.out.print(count);
}

public static int  divide_8(String input)
{   int ans=0;
        int len=input.length();
  if(input.length()==1)
  {
	   int num=input.charAt(0)-'0';
	   if(num%8==0)return 1;
  }
   if(input.length()==2)
   {
	   int num1=(input.charAt(0)-'0')*10+(input.charAt(1));
	   if(num1%8==0)ans++;
	   int num2=(input.charAt(1)-'0')*10+(input.charAt(0));
	   if(num2%8==0)ans++;
   }
   
	   // considering all three-digit sequences
       int threeDigit;
       for (int i = 0; i < (len - 2); i++) 
       {
           threeDigit = (input.charAt(i) - '0') * 100 + 
                       (input.charAt(i + 1) - '0') * 10 + 
                       (input.charAt(i + 2) - '0');
           if (threeDigit % 8 == 0)
               ans++;
       }
    
       // Considering the number formed by the 
       // last digit and the first two digits
       threeDigit = (input.charAt(len - 1) - '0') * 100 + 
                   (input.charAt(0) - '0') * 10 + 
                   (input.charAt(1) - '0');
    
       if (threeDigit % 8 == 0)
           ans++;
    
       // Considering the number formed by the last 
       // two digits and the first digit
       threeDigit = (input.charAt(len - 2) - '0') * 100 +
                   (input.charAt(len - 1) - '0') * 10 + 
                   (input.charAt(0) - '0');
       if (threeDigit % 8 == 0)
           ans++;
    
       // required count of rotations
       return ans;
   

	
}
	public static void main(String []args)
	{ 
		 int arr[] = {2, 4, 8, -1,9,10,-2} ; 
       // (arr,3);
		 rearrange1(arr);
		 
		 for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
        	 
	}
}

