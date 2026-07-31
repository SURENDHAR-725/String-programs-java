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
		HashMap<Character,Integer>hs=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    
		    if(ch!=' '){
		        hs.put(ch,hs.getOrDefault(ch,0)+1);
		    }
		    
		}
		for(Map.Entry<Character,Integer> e :hs.entrySet() ){
		    if(e.getValue()>1){
		        System.out.println(e.getKey()+" -> "+e.getValue());
		    }
		}

	}
}

=============================================
Sample Input
programming
Your Output
r -> 2
g -> 2
m -> 2
=======================================
