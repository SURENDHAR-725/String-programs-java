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
     String arr[]=s.split(" ");
     
     for(String word:arr)
     {
        String rev="";
    
     for(int i=word.length()-1;i>=0;i--)
     {
         rev+=word.charAt(i);
     }
       System.out.print(rev+" ");  
     }
    
	}
}

===========================================
Sample Input
java programming is a language 
Your Output
avaj gnimmargorp si a egaugnal 
===========================================
