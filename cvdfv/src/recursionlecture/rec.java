package recursionlecture;

public class rec {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==0)
        {
          return "";
        }
		if(s.length()==1)
		{
			return s;
		}
      String smallans=removeConsecutiveDuplicates(s.substring(1));
      if(smallans.charAt(0)==s.charAt(0))
      {    
        return smallans;
      }
      return s.charAt(0)+smallans;

	}
	public static int findFloor(int[] array, int element,int startindex)
	{
		if(element==array[startindex])
		{
			return array[startindex];
		}
		if(array[startindex]<element)
		{
			return array[startindex];
		}
		if(startindex==array.length)
		{
			return 0;
		}
		
		if(array[startindex]>element)
		{
			return 0;
		}
		int x= findFloor(array,element,startindex+1);
		if(x<array[startindex-1]&&array[startindex]<=element)
		{
			return array[startindex];
		}
		else
		{
			return x;
		}

	}

	public static void main(String[] args) {
	//	String s=removeConsecutiveDuplicates("abbbaa");// TODO Auto-generated method stub
		int arr[]= {15,20,30,60,90,100};
	int s=	findFloor(arr,80,0);
	  System.out.print(s);
  
  
	}

}
