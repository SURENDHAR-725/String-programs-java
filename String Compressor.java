import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char arr[]=a.toCharArray();
		
		String output="";
		int count=1;
		for(int i=0;i<arr.length;i++){
		    if( (i+1)<arr.length&&arr[i]==arr[i+1]){
		        count++;
		    }else{
		        output=output+arr[i]+count;
		        count=1;
		    }
		}
		
		System.out.print(output);
		

	}
}
===========================================
Sample Input
abcddd
Your Output
a1b1c1d3
===========================================
