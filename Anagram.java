import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char arr[]=a.toCharArray();
		
		char arr2[]=b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr,arr2)){
		    System.out.print("Anagram");
		}
		else{
		    System.out.print("Not a Anagram");
		}
		

	}
}

=======================================
Sample Input
surendhar
urendhars
Your Output
Anagram
=====================================
