
public class stringclass {
	public static boolean checkPalindrome(String str){
		for(int i=0;i<(str.length())/2;i++)
        { 
           for(int j=str.length()-1;j>=str.length()/2;j--)
           {  
               if(str.charAt(i)==str.charAt(j)) continue;
               else return false;
           }
          
          
        }/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
    return true;
	}
	public static void main(String[] args) {
		String s="abcedecba";
	boolean p =	checkPalindrome(s);
System.out.println(p);
	}

}
