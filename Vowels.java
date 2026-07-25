import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
	
		int vowels=0;
		int consonant=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
		    if(ch>='a' && ch<='z'){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		            vowels++;
		        }
		        else{
		            consonant++;
		        }
		    }
		    
	    }
	    
	    System.out.println("vowels "+vowels);
	    System.out.println("consonant "+ consonant);
    }
}
==============================

Sample Input
madam
Your Output
vowels 2
consonant 3

================================
-----------------------------------------------------------------------------------



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
	
		int vowels=0;
		int consonant=0;
		String vowelsLetter="";
		String consonantLetter="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
		    if(ch>='a' && ch<='z'){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		            vowels++;
		             vowelsLetter+=ch+" ";
		        }
		        else{
		            consonant++;
		            consonantLetter+=ch+" ";
		        }
		    }
		    
	    }
	    System.out.println("vowelsLetter = "+vowelsLetter);
	    System.out.println("consonantLetter = "+ consonantLetter);
	    
	    System.out.println("vowels "+vowels);
	    System.out.println("consonant "+ consonant);
    }
}



=========================================
Sample Input
madam
Your Output
vowelsLetter = a a 
consonantLetter = m d m 
vowels 2
consonant 3
==========================================
