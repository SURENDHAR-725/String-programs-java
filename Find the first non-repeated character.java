import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    
	    HashMap<Character,Integer>hs=new HashMap<>();
	    
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        
	        if(ch!=' '){
	            hs.put(ch,hs.getOrDefault(ch,0)+1);
	        }
	    }
	    
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch!=' ' && hs.get(ch)==1){
	            System.out.print("First Non Repeating Character : "+ch);
	        return; 
	            
	        }
	    }
	    System.out.print("No Non repeating Character found");
		

	}
}

===============================
Input

aabbccde

Output

First Non Repeating Character : d
===============================
