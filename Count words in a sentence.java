import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word[]=s.split(" ");
		
		   System.out.print(word.length); 
		
		

	}
}

========================================
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = s.split("\\s+");
            System.out.println(words.length);
        }
    }
}
==========================================

Sample Input
prog ramm in gs
Your Output
4

==============================================
