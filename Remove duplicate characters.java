import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		
		LinkedHashSet<Character>hs=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    
		    if(ch!=' '){
		        hs.add(ch);
		    }
		}
		
		for(Character e:hs){
		    System.out.print(e);
		}
		

	}
}
============================
Sample Input
Programming
Your Output
progamin
=============================
