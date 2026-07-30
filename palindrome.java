import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split("");
		
		
		String rev="";
		StringBuilder sb=new StringBuilder(s);
        rev=sb.reverse().toString();
        
        if(s.equals(rev)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
	}
}




==========================================

Sample Input
madam
Your Output
Palindrome
===========================================


	import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    String rev="";
	    for(int i=s.length()-1;i>=0;i--){
	        rev+=s.charAt(i);
	    }
	    
	    if(s.equals(rev)){
	        System.out.print("palindrome");
	    }
	    else{
	        System.out.print("Not Plaindrome");
	    }

	}
}
===================================================

	import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    int right=s.length()-1;
	    int left=0;
	    
	    boolean palindrome=true;
	    while(left<right){
	        if(s.charAt(left)!=s.charAt(right)){
	            palindrome=false;
	            
	        }
	        left++;
	        right--;
	        
	    }
	    
	    if(palindrome){
	        System.out.print("palindrome");
	    }
	    else{
	        System.out.print("Not a palindrome");
	    }
	}
}

