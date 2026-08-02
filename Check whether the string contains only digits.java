import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

     Scanner sc=new Scanner(System.in);
     String  s=sc.nextLine();
     
     
     boolean digit=true;
     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(ch<'0' || ch>'9'){
             digit=false;
             break;
         }
     }
      
     if(digit){
      System.out.print("Only Digit");
	}
	else{
	    System.out.print("Contains other letter");
	}
	
	}
}

================================
Sample Input
124566d
Your Output
Contains other letter
=================================
