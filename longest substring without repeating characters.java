import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		int left=0;
		int max=0;
	    
		LinkedHashSet<Character>hs=new LinkedHashSet<>();
		for(int right=0;right<s.length();right++){
		    while(hs.contains(s.charAt(right))){
		        hs.remove(s.charAt(left));
		        left++;
		    }
		    
		    hs.add(s.charAt(right));
		    
		    max=Math.max(max,right-left+1);

	}
	
	System.out.print(max);
	}
}
=============================================
Sample Input
Programming
Your Output
5
================================================
