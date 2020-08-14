package trie;



import java.util.*;
class TrieNode1
{
	HashMap<Character,TrieNode1> childern;
	boolean endofword;
	public TrieNode1()
	{
		childern=new HashMap<>();
		endofword=false;
	}
}
public class trie_implement {
  
	static  TrieNode1 root; 
	public trie_implement()
	{
		root=new TrieNode1();
	}
	
	public static void add(String str)
	{
		TrieNode1 Current=root; 
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		 TrieNode1 node =Current.childern.get(ch);
		 if(node==null)
		 {
			node=new TrieNode1();
			 Current.childern.put(ch,node);
		 }
		 Current=node;
		 
		}
		Current.endofword=true;
		
	}
	public static void traverse(String str)
	{
		TrieNode1 Current=root;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		 Current=Current.childern.get(ch);
		
		if(Current.endofword)
		{
			System.out.println("String found");
		}
		else {
			System.out.println("String Not Found");
		}
		}
		
	}
	
	public static void delete(String str)
	{
		 boolean ans= delete1(root,str,0);
		 System.out.println(ans);
	}
	
	public static boolean delete1(TrieNode1 current,String str,int index)
	{
		if(index==str.length())
		{
			if(!current.endofword)
			{
				return true;
			}
			current.endofword=false;
			return current.childern.size()==0;
		}
		
		char ch=str.charAt(index);
		TrieNode1 temp=current.childern.get(ch);
		if(temp==null)
		{
			return false;
		}
		boolean ans=delete1(temp,str,index+1);
		if(ans)
		{
			current.childern.remove(ch);
			return current.childern.size()==0;
		}
		return false;
	}
	public static void main(String args[])
	{
		trie_implement ob=new trie_implement();
		String arr[]= {"Hi","Hello","HelloWorld","HiTech"};
		for(int i=0;i<arr.length;i++)
		{
			add(arr[i]);
		}
		
		delete("Hello");
	}
}
