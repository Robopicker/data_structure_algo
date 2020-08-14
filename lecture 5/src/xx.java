
public class xx {
	
	public static void findLargest(int input[][]){
		int row=input.length;
		int sum=0;
		int r=0;
		int c=0;
		int i,j;
		int maxrow=0;
		int maxcolumn=0;
		int column=input[0].length;
		for( i=0;i<row;i++)
		{  
		      sum=0;
			for( j=0;j<column;j++)
			{
				sum=sum+input[i][j];
			
			}
			if(sum>maxrow) {maxrow=sum;
			    r=j;}
			}
		for( j=0;j<column;j++)
		{  
		      sum=0;
			for( i=0;i<row;i++)
			{
				sum=sum+input[i][j];
			
			}
			if(sum>maxcolumn) { maxcolumn=sum;
			   c=j;}
			
		}
		if(maxcolumn>maxrow)
		{
			System.out.print("column"+" "+c+" "+maxcolumn);
		}
		else if(maxcolumn<maxrow) System.out.print("row"+" "+r+" "+maxrow);
        	
		
	}
	public static void main(String[] args) {
		int arr[][]= {{3,6,9},{1,4,7},{2,8,9}};
		findLargest(arr);

	}

}
