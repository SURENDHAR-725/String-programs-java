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
