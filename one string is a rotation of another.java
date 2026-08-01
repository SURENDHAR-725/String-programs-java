import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		String temp=s1+s1;
		
		
		if(s1.length()!=s2.length()){
		    System.out.print("Not Rotation");
		    return ;
		}
		if(temp.contains(s2)){
		    System.out.print("Rotation");
		}
		else{
		    System.out.print("Not Rotation");
		}

	}
}
==============================================
Sample Input
ABCD
CDAB
Your Output
Rotation
============================================
